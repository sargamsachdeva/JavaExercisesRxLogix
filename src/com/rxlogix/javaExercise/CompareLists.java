package com.rxlogix.javaExercise;

import java.util.ArrayList;
import java.util.List;

public class CompareLists {

    public static boolean compare(List list1, List list2){
        return list1.containsAll(list2) && list1.size() == list2.size() ? true :false;
    }

    public static void main(String[] args) {

        ArrayList<String> firstList = new ArrayList<>();
        firstList.add("aaaa");
        firstList.add("bbbb");
        firstList.add("cccc");

        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("aaaa");
        secondList.add("bbbb");
        secondList.add("cccc");

        System.out.println("ComparingLists: " + compare(firstList, secondList));

        secondList.add("ddddd");

        System.out.println("ComparingLists: " + compare(firstList, secondList));
    }
}
