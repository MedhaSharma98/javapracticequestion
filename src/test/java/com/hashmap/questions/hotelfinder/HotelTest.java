package com.hashmap.questions.hotelfinder;

import com.hashmap.questions.hotelfinder.services.Mmt;
import com.hashmap.questions.hotelfinder.util.Customer;
import com.hashmap.questions.hotelfinder.util.Days;
import com.hashmap.questions.hotelfinder.model.Category;
import com.hashmap.questions.hotelfinder.model.Hotel;
import com.hashmap.questions.hotelfinder.model.Request;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelTest {
        List<Hotel> hotelList =new ArrayList<>();
        Mmt mmt;

    @Before
    public void init(){
        Map<Category,Integer> mapOFLakewood = new HashMap<Category, Integer>();
        Map<Category,Integer> mapOFBridgewood = new HashMap<Category, Integer>();
        Map<Category,Integer> mapOFRidgewood = new HashMap<Category, Integer>();

        mapOFLakewood.put(new Category(Customer.REGULAR,Days.WEEKDAY),110);
        mapOFLakewood.put(new Category(Customer.REGULAR,Days.WEEKEND),90);
        mapOFLakewood.put(new Category(Customer.REWARD,Days.WEEKDAY),80);
        mapOFLakewood.put(new Category(Customer.REWARD,Days.WEEKEND),80);


        mapOFBridgewood.put(new Category(Customer.REGULAR,Days.WEEKDAY),160);
        mapOFBridgewood.put(new Category(Customer.REGULAR,Days.WEEKEND),60);
        mapOFBridgewood.put(new Category(Customer.REWARD,Days.WEEKDAY),110);
        mapOFBridgewood.put(new Category(Customer.REWARD,Days.WEEKEND),50);


        mapOFRidgewood.put(new Category(Customer.REGULAR,Days.WEEKDAY),220);
        mapOFRidgewood.put(new Category(Customer.REGULAR,Days.WEEKEND),150);
        mapOFRidgewood.put(new Category(Customer.REWARD,Days.WEEKDAY),100);
        mapOFRidgewood.put(new Category(Customer.REWARD,Days.WEEKEND),40);

        hotelList.add(new Hotel("LAKEWOOD",3,mapOFLakewood));
        hotelList.add(new Hotel("BRIDGEWOOD",4,mapOFBridgewood));
        hotelList.add(new Hotel("RIDGEWOOD",5,mapOFRidgewood));

        mmt=new Mmt(hotelList);

    }



    @Test
    public void getCheapestHotel(){

        List<Days> daysList1 =new ArrayList<>();
        daysList1.add(Days.WEEKDAY);
        daysList1.add(Days.WEEKEND);

        List<Days> daysList2 =new ArrayList<>();
        daysList2.add(Days.WEEKEND);
        daysList2.add(Days.WEEKEND);

        Hotel hotel1 =mmt.findCheapestHotel(new Request(Customer.REGULAR,daysList1));
        Hotel hotel2 =mmt.findCheapestHotel(new Request(Customer.REWARD,daysList2));

     Map<Category,Integer> expectedMap = new HashMap<Category, Integer>();
        expectedMap.put(new Category(Customer.REGULAR,Days.WEEKDAY),210);
        expectedMap.put(new Category(Customer.REGULAR,Days.WEEKEND),150);
        expectedMap.put(new Category(Customer.REWARD,Days.WEEKDAY),100);
        expectedMap.put(new Category(Customer.REWARD,Days.WEEKEND),40);
    Hotel expectedHotel=new Hotel("RIDGEWOOD",4,expectedMap);

        Assert.assertEquals(expectedHotel.getName(),hotel2.getName());
        Assert.assertEquals(expectedHotel.getName(),hotel1.getName());



    }



}