package com.hashmap.questions.hotelfinder.model;

import com.hashmap.questions.hotelfinder.util.Customer;
import com.hashmap.questions.hotelfinder.util.Days;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Request {
    private Customer customerType;
    private List<Days> days;

}
