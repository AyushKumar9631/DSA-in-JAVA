package Reccursion;

import java.util.Scanner;

public class Binary_search {

    static int[] arr={2,5,6,7,8,17,45,67,89};

    public static void main(String[] args) {
        System.out.println("Enter element to be found");
        Scanner sc= new Scanner(System.in);
        System.out.println( bs(sc.nextInt(),0,arr.length-1));
    }

    static int bs(int target,int s, int e){
        if(s>e) return -1;
        else{
            int mid= e-(e-s)/2;
            if (arr[mid]==target) return mid;
            else if(arr[mid]>target) return bs(target,s,mid-1);
            else return bs(target,mid+1,e);
        }
    }
}
