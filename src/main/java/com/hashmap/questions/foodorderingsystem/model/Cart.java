package com.hashmap.questions.foodorderingsystem.model;

import com.hashmap.questions.foodorderingsystem.services.HotelServiceImplementation;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Cart {
   private List<Request> cartList = new ArrayList<Request>();
   private HotelServiceImplementation hotelServices=new HotelServiceImplementation();
   private List<Hotel> hotelList;

   public Cart(){
      hotelList=hotelServices.getHotelList();
      }

   public void addItem(Request request) {
      for(Hotel h:hotelList){
         if((h.getName().equals(request.hotelName))&&(h.getMenu().containsKey(request.getItem()))){
            cartList.add(request);
         }
      } }

   public void deleteItem(Food item){
       cartList.remove(item);
   }
}
