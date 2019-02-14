package com.hashmap.questions.hotelfinder.Services;

import com.hashmap.questions.hotelfinder.Util.Customer;
import com.hashmap.questions.hotelfinder.model.Category;
import com.hashmap.questions.hotelfinder.model.Hotel;
import com.hashmap.questions.hotelfinder.model.Request;

import java.util.*;

public class Mmt implements HotelService {
    private ArrayList<Hotel> hotels=new ArrayList<Hotel>();
    private Map<Category,Integer> mapOFLakewood = new HashMap<Category, Integer>();
    Map<Category,Integer> mapOFBridgewood = new HashMap<Category, Integer>();
    Map<Category,Integer> mapOFRidgewood = new HashMap<Category, Integer>();
    ArrayList<Category> categories ;

    public Mmt(ArrayList<Category> categories){

   this.categories=categories;

        mapOFLakewood.put(categories.get(0),110);
        mapOFLakewood.put(categories.get(1),90);
        mapOFLakewood.put(categories.get(2),80);
        mapOFLakewood.put(categories.get(3),80);


        mapOFBridgewood.put(categories.get(0),160);
        mapOFBridgewood.put(categories.get(1),60);
        mapOFBridgewood.put(categories.get(2),110);
        mapOFBridgewood.put(categories.get(3),50);


        mapOFRidgewood.put(categories.get(0),220);
        mapOFRidgewood.put(categories.get(1),150);
        mapOFRidgewood.put(categories.get(2),100);
        mapOFRidgewood.put(categories.get(3),40);

        hotels.add(new Hotel("LAKEWOOD",3,mapOFLakewood));
        hotels.add(new Hotel("BRIDGEWOOD",4,mapOFBridgewood));
        hotels.add(new Hotel("RIDGEWOOD",5,mapOFRidgewood));
    }


    public Hotel findCheapestHotel(Request request) {
        int x=-1;
        int dayOfWeek;
        int sum[]=new int[3];
        String visitingDates=request.getVisitingDates();
        String dates[]=visitingDates.split(" ");
        Map<Category,Integer> map;

        for (Hotel hotel : hotels) {
            x++;

            for (int i = 0; i <dates.length; i++) {
                dayOfWeek = getDate(dates[i]);
                map=hotel.getRateCard();
                if (dayOfWeek >= 2&& dayOfWeek <= 6) {
                    if (request.getCustomerType().equals(Customer.REGULAR)) {

                        sum[x]+=map.get(categories.get(0));
                    } else {

                       sum[x]+=map.get(categories.get(2));

                    }
                }else{

                    if (request.getCustomerType().equals(Customer.REGULAR)) {
                        sum[x] += map.get(categories.get(1));
                    } else {
                        sum[x] += map.get(categories.get(3));
                    }
                } }

        }



        return arrayMinimum(sum);
    }

    private Hotel arrayMinimum(int sum[]) {
        int min = sum[0];
        int x = 0;
        for (int i = 1; i < sum.length; i++) {
            if (min > sum[i]) {
                min = sum[i];
                x = i;
            }
            if (min == sum[i]) {
                if (hotels.get(x).getRating() > hotels.get(i).getRating()) {
                    min = sum[x];
                } else {
                    min = sum[i];
                    x = i;
                }
            }
        }

        if(x==0){
            return hotels.get(0);
        }else if(x==1){
            return hotels.get(1);
        }
        return hotels.get(2);
    }

    private int getDate(String string){
        Calendar c = Calendar.getInstance();
        Date d= new Date(string);
        c.setTime(d);
        return(c.get(Calendar.DAY_OF_WEEK));
    }

}
