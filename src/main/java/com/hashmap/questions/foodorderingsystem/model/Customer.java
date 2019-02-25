package com.hashmap.questions.foodorderingsystem.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Customer {
    private String name;
    private long phoneno;
    private String address;
    private Cart cart;
}
