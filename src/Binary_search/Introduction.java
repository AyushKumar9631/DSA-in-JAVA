package Binary_search;

public class Introduction {
    public static void main(String[] args) {
        int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,88};
        int ans= search_index(arr,100);
        System.out.println(ans);
    }

    //return index
    //return -1 if item not found
    static int search_index(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

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
