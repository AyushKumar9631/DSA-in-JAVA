package Binary_search;

import java.util.Arrays;

public class infinite_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,0,1,2,3,23,369,324,34,3,45,5,65,456,67,7,8,78,9,44,89,45,33,67,787,878,78,87};
        int target=23;
        int[] chunk= find_chunk(arr,target);
        int ans= search_index(arr,target,chunk[0],chunk[1]);
        System.out.println(Arrays.toString(chunk));
        System.out.println(ans);

    }

    static int[] find_chunk(int[] arr, int target){
        int start=0;
        int end=1;
        int size=4;
        while(target>arr[end]){
            start=end+1;
            end=end+size;
            size*=2;
        }
        return new int[]{start,end};
    }

    static int search_index(int[] arr, int target, int start, int end){

        while(start<=end){
            // if value of start and end is very high then applying (mid=start+end)/2 can lead to overflow
            int mid=start+(end-start)/2;

            if(target<arr[mid]) end=mid-1;
            if(target>arr[mid]) start=mid+1;
            if(target==arr[mid]) return mid;
        }
        return -1;

    }
}
