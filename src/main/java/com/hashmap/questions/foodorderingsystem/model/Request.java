package com.hashmap.questions.foodorderingsystem.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Request{
 String hotelName;
 Food item;
 int quantity;
}
