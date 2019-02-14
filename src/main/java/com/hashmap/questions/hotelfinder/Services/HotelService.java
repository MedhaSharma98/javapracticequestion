package com.hashmap.questions.hotelfinder.Services;

import com.hashmap.questions.hotelfinder.model.Hotel;
import com.hashmap.questions.hotelfinder.model.Request;

public interface HotelService {
 public Hotel findCheapestHotel(Request request);
}
