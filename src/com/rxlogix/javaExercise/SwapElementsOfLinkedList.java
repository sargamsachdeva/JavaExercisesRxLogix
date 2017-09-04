package com.rxlogix.javaExercise;

import java.util.Collections;
import java.util.LinkedList;

public class SwapElementsOfLinkedList {

    public static void main(String a[]){

        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("groovy");
        list.add("grails");
        list.add("sargam");
        list.add("rxlogix");
        list.add("developer");

        Collections.swap(list, 1, 3);
        System.out.println("After swapping:");
        for(String str: list){
            System.out.println(str);
        }
    }
}
