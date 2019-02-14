package com.hashmap.questions.mapquestion;


import lombok.Getter;

import java.util.*;

@Getter
public class MapSort{


    public static<K,V extends Comparable> Map<K,V> getSortedMap(Map<K,V> unsortedHashMap){
        List<Map.Entry<K,V>> list = new ArrayList<Map.Entry<K, V>>(unsortedHashMap.entrySet());
        list.sort(new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        Map<K,V> sortedMap = new LinkedHashMap<K, V>();
        for (Map.Entry<K,V> aa : list) {
            sortedMap.put(aa.getKey(), aa.getValue());
        }

        return sortedMap;
    }





}
