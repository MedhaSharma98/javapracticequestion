package com.hashmap.questions.hotelfinder.model;


import com.hashmap.questions.hotelfinder.util.Customer;
import com.hashmap.questions.hotelfinder.util.Days;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class Hotel {
  private String name;
  private int rating;
  private Map<Category, Integer> rateCard;

  public int getRateOfHotel(Hotel hotel, Customer customerType, Days dayType) {
    Map<Category, Integer> mapOfRateCard = hotel.getRateCard();

    for (Map.Entry<Category, Integer> map : mapOfRateCard.entrySet()) {
      if ((map.getKey().getCustomer().equals(customerType)) && (map.getKey().getDaytype().equals(dayType))) {
        return map.getValue(); } }
    return 0;
  }

  public static Hotel getHotel(String hotelName,List<Hotel> hotelList){
    for(Hotel hotel:hotelList){
      if(hotel.getName().equals(hotelName))
        return hotel; }
   return null; }
}
