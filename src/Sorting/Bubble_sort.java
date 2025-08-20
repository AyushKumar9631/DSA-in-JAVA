package Sorting;

import java.util.Arrays;


public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr= {1,4,6,3,78,9,65,3};
//        bubble_sort(arr);

        bsr(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
//without recursion
    static void bubble_sort(int[] arr){
        //run the steps n-1 times
        for(int i=0; i<arr.length;i++){
            boolean swapped=false;
            //for each step array gets arranged from back
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    // put swapped as true
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
    }
//with recursion
    static void bsr(int[] arr, int end){
        if(end<=1) return;
        boolean swapped= false;
        for(int i=0; i<end-1; i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                swapped=true;
            }
        }
        if(swapped) bsr(arr,end-1);
    }
}
