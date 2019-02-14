package com.hashmap.questions.mapquestion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapSortTest {

    @Test
    public void getsortedmap() {
        Map<Integer,Integer> expectedMap= new LinkedHashMap<>();
        expectedMap.put(1,10);
        expectedMap.put(3,20);
        expectedMap.put(4,25);
        expectedMap.put(2,30);

        Map<Integer,Integer> unsortedMap=new LinkedHashMap<>();
        unsortedMap.put(4,25);
        unsortedMap.put(2,30);
        unsortedMap.put(1,10);
        unsortedMap.put(3,20);

        Map<Integer,Integer> mapAftersorting= MapSort.getSortedMap(unsortedMap);


    }
}