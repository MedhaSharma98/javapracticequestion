package com.hashmap.questions.foodorderingsystem.model;

import com.hashmap.questions.foodorderingsystem.services.FoodPanda;
import com.hashmap.questions.foodorderingsystem.utilty.Themes;
import com.hashmap.questions.foodorderingsystem.utilty.Type;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FoodTest {
    FoodPanda foodPanda;
    Cart cart;

    @Before
    public void init(){
        foodPanda=new FoodPanda();
        cart=new Cart();
        cart.addItem(new Request("LAKEWOOD",new Food("NOODLES",new Category(Themes.CHINESE, Type.VEG)),2));
        cart.addItem(new Request("BRIDGEWOOD",new Food("NOODLES",new Category(Themes.CHINESE, Type.VEG)),2));
    }

    @Test
    public void getBill(){
        double billAmount=foodPanda.placeOrderAndGetAmount(new Customer("Medha",98765432,"Hinjewadi,pune",cart));
        double expectedBill=440;
        Assert.assertEquals((long)expectedBill,(long)billAmount);
    }
}