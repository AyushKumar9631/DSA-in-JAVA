package Hashmaps;
import java.util.*;
public class Radix_sort {
    public static void sort(int arr[]){
        int max=Arrays.stream(arr).max().getAsInt();

        //do count sort for every digit place
        for(int exp=1; max/exp>0; exp*=10){
            countSort(arr, exp);
        }
    }

    public static void countSort(int[] arr, int exp){
        int n=arr.length;
        int[] output=new int[n];
        int[] count=new int[10];

        Arrays.fill(count,0);

        for(int i=0; i<n; i++) count[(arr[i]/exp)%10]++;
        System.out.println("Count Array for "+exp+" : "+ Arrays.toString(count));

        for(int i=1; i<10; i++) count[i]+=count[i-1];
        System.out.println("Updated Count Array for "+exp+" : "+ Arrays.toString(count));

        for(int i=n-1; i>=0; i--){
            output[count[(arr[i]/exp)%10]-1]=arr[i];
            count[(arr[i]/exp)%10]--;
        }
        System.out.println("updated original array: "+ Arrays.toString(output));
        System.arraycopy(output,0,arr,0,n);

    }

    public static void main(String[] args) {
        int[] arr={29,83,471,36,91,8};
        System.out.println("Original Array: "+ Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted Array: "+ Arrays.toString(arr));
    }

}
