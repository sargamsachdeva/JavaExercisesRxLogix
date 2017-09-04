package com.rxlogix.javaExercise;

import java.util.*;

public class RemoveDuplicateFromHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "sargam");
        map.put(2, "sachdeva");
        map.put(3, "grails");
        map.put(4, "sachdeva");
        map.put(5, "grails");
        map.put(6, "rxlogix");

        HashSet<String> set = new HashSet<>();
        set.addAll(map.values());

        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
