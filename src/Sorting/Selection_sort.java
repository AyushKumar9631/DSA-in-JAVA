package Sorting;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr= {1,4,6,3,78,9,65,3};
        //selection_sort(arr);
        ssr(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
//without recursion
    static void selection_sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            //finding last and max elements indexes to swap
            int last_idx= arr.length-1-i;
            int max_idx= get_maxidx(arr,0,last_idx);
            int temp= arr[last_idx];
            arr[last_idx]=arr[max_idx];
            arr[max_idx]=temp;
        }
    }

    //with recursion
    static void ssr(int[] arr, int end){
        if(end==0) return;
        int idx= get_maxidx(arr,0,end-1);

        if(idx!=--end){
            int temp=arr[idx];
            arr[idx]=arr[end];
            arr[end]=temp;
        }

        ssr(arr, end);
    }

    static int get_maxidx(int[] arr,int start,int end){
        int max_idx=start;
        for (int i = start+1; i <= end; i++) {
            if(arr[max_idx]<arr[i]){
                max_idx=i;
            }
        }
        return max_idx;
    }
}
