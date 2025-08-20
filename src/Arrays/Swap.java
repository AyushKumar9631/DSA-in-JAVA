package com.ayush;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        // initialization and addition
        System.out.println("enter 4 digits to an array");
        int[] arr= new int[4];
        for (int i=0; i<4; i++) {
            arr[i]= in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Enter indexes to swap");
        swap(arr,in.nextInt(), in.nextInt());

        System.out.println("array after swaping is");
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr,int a, int b){
        int temp= arr[a];
        arr[a]= arr[b];
        arr[b]= temp;
    }
}
