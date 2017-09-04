package com.rxlogix.javaExercise;

import java.util.Scanner;

public class SquarePattern {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int maxRows;

        System.out.println("Enter number of rows");
        maxRows = input.nextInt();

        for(int i = 0;i < maxRows;i++){

            for(int j = 0; j< maxRows; j++){

                if(i == 0 || j == 0 || i == maxRows-1 || j == maxRows-1)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
