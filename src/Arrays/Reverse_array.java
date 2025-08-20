package com.ayush;

import java.util.Arrays;
import java.util.Scanner;
import static com.ayush.Swap.swap;

public class Reverse_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of elements in an array");
        int l= in.nextInt();
        int[] arr= new int[l];
        System.out.println("Put values in array");
        for(int i=0; i<l; i++){
            arr[i]= in.nextInt();
        }
        System.out.println("Initial array"+ Arrays.toString(arr));
        int start=0;
        int end=l-1;
        while(start<end){
//            int temp= arr[start];
//            arr[start]= arr[end];
//            arr[end]= temp;
            swap(arr,start,end);
            start++;
            end--;
        }
        System.out.println("Final array= "+ Arrays.toString(arr));
    }
}
