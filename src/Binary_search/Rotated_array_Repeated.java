package Binary_search;

public class Rotated_array_Repeated {
    public static void main(String[] args) {
        int[] arr={4};
        System.out.println(find_pivot(arr));
    }

     static int find_pivot(int[]arr){
         int start=0;
         int end=arr.length-1;
         while(start<=end){
             int mid=start+(end-start)/2;
             if( mid<end && arr[mid]>arr[mid+1]) return mid;
             else if(mid>start && arr[mid]<arr[mid-1]) return mid-1;
             else if(arr[start]==arr[mid] && arr[end]== arr[mid]){
                 if(arr[start]>arr[start+1]) return start;
                 else if(arr[end]<arr[end-1]) return end-1;
                 start++;
                 end--;
             }

             else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                 start=mid+1;
             }
             else end=mid-1;
         }
         return -1;
    }
}
