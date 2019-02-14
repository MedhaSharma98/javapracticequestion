package com.hashmap.questions.hotelfinder.model;

import com.hashmap.questions.hotelfinder.Util.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Request {
    private Customer customerType;
    private String visitingDates;
    //List<Day> days;


}
