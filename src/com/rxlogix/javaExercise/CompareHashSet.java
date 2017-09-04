package com.rxlogix.javaExercise;

import java.util.HashSet;

public class CompareHashSet {
    
    public static void main(String[] args) {
        
        HashSet<String> set1 = new HashSet<>();
        set1.add("sargam");
        set1.add("sachdeva");
        set1.add("rxlogix");
        set1.add("grails");
        
        System.out.println("First HashSet contains: "+set1);
        
        HashSet<String>set2 = new HashSet<>();
        set2.add("sargam");
        set2.add("priya");
        set2.add("grails");
        set2.add("coding");
        
        System.out.println("Second HashSet contains: "+set2);
        set1.retainAll(set2);
        System.out.println("Output: "+set1);
    }
}
