package com.rxlogix.javaExercise;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetQues {

    public static void main(String[] args) {

        TreeSet <Integer> treeSet = new TreeSet<>();
        Scanner input = new Scanner(System.in);
        treeSet.add(1);
        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(2);


        System.out.println("Original Treeset: "+treeSet);
        System.out.println("Enter the element you want to remove:");
        Integer ele = input.nextInt();

        System.out.println("Removing element: "+treeSet.remove(ele));
        System.out.println("Final Treeset after removing element: "+treeSet);
    }
}