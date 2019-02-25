package com.hashmap.questions.hotelfinder.model;

import com.hashmap.questions.hotelfinder.util.Customer;
import com.hashmap.questions.hotelfinder.util.Days;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Category {
   private Customer customer;
   private Days daytype;



}
