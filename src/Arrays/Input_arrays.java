package com.ayush;

import java.util.Arrays;
import java.util.Scanner;

public class Input_arrays {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        // basic inputting
        int[] arr= new int[5];
        arr[0]= 23;
        arr[1]= 53;
        arr[2]= 233;
        arr[3]= 67;
        arr[4]= 3298;

        // inputting via loops
        for (int i=0; i< arr.length; i++){
            arr[i]= in.nextInt();
        }
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] +" ");
        }

        // other method
        for( int i : arr){  // for every element in array run loop while taking i as every element at a time
            System.out.println(i+" ");
        }

        // Third method
        System.out.println(Arrays.toString(arr));

       // System.out.println(arr[7]);  // index out of bond error
    }
}
