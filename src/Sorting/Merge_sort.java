package Sorting;

import java.util.Arrays;

public class Merge_sort {
    public static void main(String[] args) {
        int[] arr= {1,4,6,3,78,9,65,3};
        int [] res=mergesort(arr);
        System.out.println(Arrays.toString(res ));
        int n=Integer.MAX_VALUE;
    }

    public static int[] mergesort(int[] arr){
        int l=arr.length;
        if(l==1) return arr;

        //division into smaller divisions
        int mid=l/2;
        int[] arr1=mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] arr2=mergesort(Arrays.copyOfRange(arr,mid,l));

        return combine(arr1, arr2);
    }

    static int[] combine(int[] arr1, int[] arr2){
        int l1=arr1.length;
        int l2=arr2.length;
        int[] res= new int[l1+l2];
        int i1=0, i2=0, i3=0;

        //when both not empty
        while(i1<l1 && i2<l2){
            if(arr1[i1]<=arr2[i2]){
                res[i3]=arr1[i1];
                i1++;
            }
            else{
                res[i3]=arr2[i2];
                i2++;
            }
            i3++;
        }

        //when arr2 empty
        while(i1<l1){
            res[i3]=arr1[i1];
            i1++;
            i3++;
        }

        //when arr1 empty
        while(i2<l2){
            res[i3]=arr2[i2];
            i2++;
            i3++;
        }

        return res;
    }
}
