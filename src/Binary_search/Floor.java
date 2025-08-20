package Binary_search;

public class Floor {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=0;
        int ans= Find_floor(arr,target);
        System.out.println(ans);
    }

    static int Find_floor(int[]arr, int target){
        int start=0;
        int end =arr.length-1;

        if(arr[start]>target) {
            System.out.print("Lesser than smallest value :");
            return arr[start];
        }

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target>arr[mid]) start=mid+1;
            else if(target<arr[mid]) end=mid-1;
            else if(target==arr[mid]) return arr[mid];
        }

        return arr[end];
    }
}
