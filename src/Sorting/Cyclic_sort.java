package Sorting;

import java.util.Arrays;

public class Cyclic_sort {
    public static void main(String[] args) {
        int[] arr= {5,6,4,7,3,2,1};
        cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic_sort(int[] arr){
        int i=0;
            while(i<arr.length){
                if(arr[i]!=arr[arr[i]-1]) {
                    int temp = arr[i];
                    arr[i] = arr[temp - 1];
                    arr[temp - 1] = temp;
                }
                else i++;
            }
        }
    }
