package com.rxlogix.javaExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CopyList {

    public static void main(String[] args) {

        List<String> firstList = new ArrayList<>();

        firstList.add("a");
        firstList.add("b");
        firstList.add("c");
        firstList.add("d");
        firstList.add("e");

        List<String> secondList = firstList.stream().collect(Collectors.toList());
        System.out.println("Second list: "+secondList);
    }
}
