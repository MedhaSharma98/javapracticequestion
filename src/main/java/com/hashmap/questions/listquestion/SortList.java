package com.hashmap.questions.listquestion;

import java.util.ArrayList;
import java.util.Collections;
import  java.util.List;

public class SortList {

    public static <T extends Comparable> List<T> getSortedList(List<T> listName) {
        List<T> duplicateList = new ArrayList<>();
        List<T> uniqueList = new ArrayList<>();
        for (T element : listName) {
            if (uniqueList.contains(element)) {
                duplicateList.add(element);

            } else {
                uniqueList.add(element);
            }
        }
        Collections.sort(uniqueList);
        Collections.sort(duplicateList);
        uniqueList.addAll(duplicateList);

        return uniqueList;


    }
}