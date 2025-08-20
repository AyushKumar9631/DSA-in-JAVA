package Sorting;

import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr= {1,4,6,3,78,9,65,3};
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion_sort(int[] arr){
        //take value of i from 0 to n-1
        for(int i=0; i<arr.length-1; i++){
            //value of j will be new element which is decreasing with every swap
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else break;
            }
        }
    }
}
