package com.rxlogix.javaExercise;

import java.util.HashMap;

public class ShallowCopyHashMap {
    public static void main(String args[]) {

        HashMap<Integer, String> map1 = new HashMap<>();
        
        map1.put(1, "sargam");
        map1.put(2, "sachdeva");
        map1.put(3, "priya");
        map1.put(4, "rxlogix");
        map1.put(5, "grails");

        System.out.println("First HashMap: "+map1);
        
        HashMap<Integer, String> map2;

        map2=(HashMap)map1.clone();

        System.out.println("Cloned Map: "+map2);

    }
}