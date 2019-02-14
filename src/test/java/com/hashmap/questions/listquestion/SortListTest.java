package com.hashmap.questions.listquestion;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortListTest {

    @Test
    public void test(){
        List <Integer> arrList1 =new ArrayList<>();
        List <Integer> arrList2 =new ArrayList<>();
        arrList1.add(1);
        arrList1.add(2);
        arrList1.add(1);
        arrList1.add(3);
        arrList1.add(2);

        arrList2= SortList.getSortedList(arrList1);
        Assert.assertArrayEquals(Arrays.asList(1,2,3,1,2).toArray(),arrList2.toArray());

    }
}