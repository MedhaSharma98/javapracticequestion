package com.hashmap.questions.foodorderingsystem.model;

import com.hashmap.questions.foodorderingsystem.utilty.Themes;
import com.hashmap.questions.foodorderingsystem.utilty.Type;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Category {
    private Themes theme;
    private Type type;
}
