package com.rxlogix.javaExercise;

public class Singleton {

    private static Singleton obj;

    private Singleton(){}

    public static Singleton  getInstance()
    {
        if (obj ==null )
        {
            synchronized(Singleton.class)
            {
                if (obj ==null )
                {
                    obj=new Singleton();
                    System.out.println(obj);
                }
            }
        }
        return obj ;
    }

    public static void main(String[] args) {
        Singleton.getInstance();
    }

}
