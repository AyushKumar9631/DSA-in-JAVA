package Binary_search;

public class Rotated_array {
    public static void main(String[] args) {
        int[] nums={1,7,8,9,33,0};
        int target=7;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int pivot=find_pivot(nums);
        System.out.println("pivot" +pivot);
        if(pivot==-1) return Bsearch(nums,0,nums.length-1,target);
        if(nums[0]>target) return Bsearch(nums,pivot+1,nums.length-1,target);
        else return Bsearch(nums,0,pivot,target);
    }

    public static int find_pivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if( mid<end && arr[mid]>arr[mid+1]) return mid;
            else if(mid>start && arr[mid]<arr[mid-1]) return mid-1;
            else if(arr[mid]<=arr[start]) end=mid-1;
            else if(arr[mid]>arr[start]) start=mid+1; //because if mid would have been pivot it would have been returned
        }
        return -1;
    }

    public static int Bsearch(int[] arr,int  start,int end,int target ){
        while(start<=end){
            int mid= start+(end-start)/2;
            if(target== arr[mid]) return mid;
            if(target>arr[mid]) start=mid+1;
            if(target<arr[mid]) end= mid-1;
        }
        return -1;
    }
}
