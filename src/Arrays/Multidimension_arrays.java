package com.ayush;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimension_arrays {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        /*
             123
             456
             789
         */
        int[][] arr= new int[3][]; // no. of columns is not mandatory, but we can put it if we like
        // or directly
        int[][] arr2={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //input
        int[][] arr3= new int[2][3];
        System.out.println(arr3.length); // no of rows

        for(int row=0; row<arr3.length; row++){
            for(int col=0; col<arr3[row].length; col++){
                arr3[row][col]= in.nextInt();
            }
        }

        // output
        for(int row=0; row<arr3.length; row++){
            for(int col=0; col<arr3[row].length; col++){
                System.out.print(arr3[row][col] + " ");
            }
            System.out.println();
        }

        // Or
        for(int row=0; row<arr3.length; row++){
            System.out.println(Arrays.toString(arr3[row]));
        }

        // Or
        for(int[] a: arr3){
            System.out.println(Arrays.toString(a));
        }


    }
}
