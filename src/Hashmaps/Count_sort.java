package Hashmaps;

import java.util.Arrays;
import java.util.HashMap;

public class Count_sort {
    public static void main(String[] args) {
        int[] arr={3,5,10,6,3,10,9,2,4,9,7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr2={3,5,10,6,3,10,9,2,4,9,7};
        sort2(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    public static void sort(int[] arr){
        if(arr.length==1) return;
        int max=arr[0];
        for(int num:arr) if(num>max) max=num;

        int[] frequencies= new int[max+1];
        for(int num:arr) frequencies[num]++;

        int index=0;
        for(int i=0; i<arr.length; i++){
            while(frequencies[i]>0){
                arr[index]=i;
                index++;
                frequencies[i]--;
            }
        }
    }

    public static void sort2(int[] arr){
        if(arr.length==1) return;
        int max=Arrays.stream(arr).max().getAsInt();
        int min=Arrays.stream(arr).min().getAsInt();
        HashMap<Integer, Integer> countMap= new HashMap<>();
        for(int num: arr){
            countMap.put(num,countMap.getOrDefault(num,0)+ 1);
        }

        int index=0;
        for(int i=min; i<=max; i++){
            int count=countMap.getOrDefault(i,0);
            while(count>0){
                arr[index]=i;
                index++;
                count--;
            }
        }
    }
}
