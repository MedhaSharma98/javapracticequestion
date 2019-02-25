package com.hashmap.questions.foodorderingsystem.services;

import com.hashmap.questions.foodorderingsystem.model.*;
import com.hashmap.questions.foodorderingsystem.utilty.Themes;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Getter
public class FoodPanda implements OrderInterface{
    private Map<Food, Integer> foodMap = new HashMap<Food, Integer>();
    private List<Order> orderList = new ArrayList<Order>();

    private int i = 0;
    private double total = 0;

    HotelServiceImplementation hotelServices;

    public FoodPanda() {
        hotelServices=new HotelServiceImplementation();
    }

    public double placeOrderAndGetAmount(Customer customer){
        Double total = findTotalBill(customer.getCart().getCartList());
        orderList.add(new Order(++i, customer, total));
        return total;
    }

    public void cancelOrder(int orderId) {
        for(Order o : orderList) {
          if(o.getOrderId() == orderId) {
             orderList.remove(o);
            } }
    }

    private double findTotalBill(List<Request> list) {
        for(Request request:list) {
          for (Hotel hotel : hotelServices.getHotelList()) {
            if (hotel.getName().equals(request.getHotelName())){
                total+=(hotel.getMenu().get(request.getItem()))*(request.getQuantity());
            } } }
        return total;
    }
}

