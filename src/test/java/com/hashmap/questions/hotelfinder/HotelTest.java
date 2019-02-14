package com.hashmap.questions.hotelfinder;

import com.hashmap.questions.hotelfinder.Services.Mmt;
import com.hashmap.questions.hotelfinder.Util.Customer;
import com.hashmap.questions.hotelfinder.Util.Days;
import com.hashmap.questions.hotelfinder.model.Category;
import com.hashmap.questions.hotelfinder.model.Hotel;
import com.hashmap.questions.hotelfinder.model.Request;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HotelTest {


    @Test
    public void getCheapestHotel(){

        Category category1=new Category(Customer.REGULAR, Days.WEEKDAY);
        Category category2=new Category(Customer.REGULAR,Days.WEEKEND);
        Category category3=new Category(Customer.REWARD,Days.WEEKDAY);
        Category category4=new Category(Customer.REWARD,Days.WEEKEND);

        ArrayList<Category> categories =new ArrayList<Category>();
        categories.add(category1);
        categories.add(category2);
        categories.add(category3);
        categories.add(category4);

     Mmt mmt =new Mmt(categories);
     Hotel hotel =mmt.findCheapestHotel(new Request(Customer.REWARD,"2/15/2019 2/16/2019"));

     Map<Category,Integer> expectedMap = new HashMap<Category, Integer>();
        expectedMap.put(category1,210);
        expectedMap.put(category2,150);
        expectedMap.put(category3,100);
        expectedMap.put(category4,40);
    Hotel expectedHotel=new Hotel("RIDGEWOOD",4,expectedMap);

        Assert.assertEquals(expectedHotel.getName(),hotel.getName());



    }



}