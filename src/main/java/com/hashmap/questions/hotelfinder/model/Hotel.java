package com.hashmap.questions.hotelfinder.model;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import java.util.Map;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Hotel {
  private  String name;
  private  int rating;
  private Map<Category,Integer> rateCard;


}
