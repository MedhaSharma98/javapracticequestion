package com.hashmap.questions.hotelfinder.services;

import com.hashmap.questions.hotelfinder.util.Customer;
import com.hashmap.questions.hotelfinder.model.Category;
import com.hashmap.questions.hotelfinder.model.Hotel;
import com.hashmap.questions.hotelfinder.model.Request;
import com.hashmap.questions.hotelfinder.util.Days;

import java.util.*;

public class Mmt implements HotelService {
    private List<Hotel> hotelList = new ArrayList<Hotel>();
    private List<Days> days;


    public Mmt(List<Hotel> hotelList) {
        this.hotelList = hotelList;
    }


    public Hotel findCheapestHotel(Request request) {
        int totalCost ;
        Map<String, Integer> mapOfHotelsCost = new HashMap<>();
        days = request.getDays();

        for (Hotel hotel : hotelList) {
            totalCost=0;
            for (Days day : days) {
                totalCost += hotel.getRateOfHotel(hotel, request.getCustomerType(), day);
            }
         mapOfHotelsCost.put(hotel.getName(),totalCost);
        }
        return minimumCostinList(mapOfHotelsCost);
    }


    private Hotel minimumCostinList(Map<String, Integer> mapOfHotelCost) {
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(mapOfHotelCost.entrySet());
        String hotelName;

        list.sort(Comparator.comparing(Map.Entry::getValue));

        hotelName = list.get(0).getKey();
        return Hotel.getHotel(hotelName, hotelList);
    }
}