package com.ayush;

import java.util.Scanner;

import static com.ayush.Swap.swap;

public class Max {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] arr= new int[5];
        for(int i=0; i<5; i++){
            arr[i]= in.nextInt();
        }
        System.out.println("Max = "+ max(arr));

        System.out.println("Enter indexes limit");
        int a= in.nextInt();
        int b= in.nextInt();
        System.out.println("Max in range = "+ maxlim(arr,Math.max(a,b),Math.min(a,b)));
        System.out.println("Enter indexes to swap");
        swap(arr,in.nextInt(),in.nextInt());
    }

    static int max(int[] arr){
        int max= arr[0];
        for( int i=1; i<5;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
         return max;
    }

    static int maxlim(int[] arr, int a, int b){
        int max= arr[a];
        for( int i=a+1; i<b;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }
}
