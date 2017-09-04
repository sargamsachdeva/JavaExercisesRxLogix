package com.rxlogix.javaExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Student {
    private int id;
    private String name;
    private ArrayList<Integer> subject;

    public Student(int id, String name,ArrayList<Integer> subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }
    public Integer maxMarks(){
        return subject.stream().reduce(0,Integer::max);
    }

    public Integer minMarks(){
        return subject.stream().min(Integer::min).get();
    }

    public Double average(){
        return subject.stream().collect(Collectors.averagingInt(Integer::intValue));
    };

    public Integer percentage(){
        Integer sum =subject.stream().reduce(0,Integer::sum);
        System.out.println("size:"+subject.size()*100);
        return (sum*100)/(subject.size()*100);
    }

    public int getId() {
        return id;
    }

    public ArrayList<Integer> getSubject() {
        return subject;
    }
}
