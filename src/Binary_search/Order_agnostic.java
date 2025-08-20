package Binary_search;

//when you know its sorted but don't know the order
public class Order_agnostic {
    public static void main(String[] args) {
        //int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,88};
        int [] arr={99,80,75,22,11,10,5,3,-3};
        int ans= Order_agnostic_search(arr,22);
        System.out.println(ans);
    }

    static int Order_agnostic_search(int[]arr, int target){
        int start=0;
        int end=arr.length-1;

        // find whether array is ascending or not
        boolean isAsc= arr[start]<arr[end];

        while(start<=end){
            // if value of start and end is very high then applying (mid=start+end)/2 can lead to overflow
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                if(isAsc) end=mid-1;
                else start=mid+1;
            }
            if(target>arr[mid]){
                if(isAsc) start=mid+1;
                else end=mid-1;
            }
            if(target==arr[mid]) return mid;
        }
        return -1;
    }
}
