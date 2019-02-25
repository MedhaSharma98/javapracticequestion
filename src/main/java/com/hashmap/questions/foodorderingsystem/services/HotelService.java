package com.hashmap.questions.foodorderingsystem.services;

import com.hashmap.questions.foodorderingsystem.model.Hotel;

import java.util.List;

public interface HotelService{
    public void showMenu(Hotel hotel);
    public List<Hotel> getHotelList();
    public void addHotel(Hotel hotel);
    public void removeHotel(Hotel hotel);
}
