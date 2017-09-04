package com.rxlogix.javaExercise;

import java.util.ArrayList;

public class StudentDemo {


    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(78);
        arrayList.add(89);
        arrayList.add(98);
        arrayList.add(70);
        arrayList.add(67);
        Student student = new Student(1,"sargam", arrayList);
        System.out.println("Maximum marks: "+student.maxMarks());
        System.out.println("Minimum marks: "+student.minMarks());
        System.out.println("Average marks:"+student.average());
        System.out.println("Percentage: "+student.percentage());
    }
}
