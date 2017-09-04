package com.rxlogix.javaExercise;

import java.util.LinkedList;
import java.util.List;

public class CompareLinkedList {

    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        list1.add("aaaa");
        list1.add("bbbb");
        list1.add("cccc");

        List<String> list2 = new LinkedList<>();
        list2.add("aaaa");
        list2.add("bbbb");
        list2.add("cccc");

        System.out.println("Both lists contain same elements: "+list1.containsAll(list2));
    }
}