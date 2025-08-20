package Binary_search;
//find the smallest number greater than and equal to given number
public class ceiling {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=10;

        //tried by me
        int ans= find_ceiling(arr,target);
        System.out.println(ans);

        // ideal solution
        int ans2= find_Ceiling_Ideal_soln(arr,target);
        System.out.println(ans2);

    }

    static int find_ceiling(int[] arr, int target){
        int start=0;
        int end =arr.length-1;
        int index=end;

        if(arr[end]<target) {
            System.out.print("Greater than largest value :");
            return arr[end];
        }

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target>arr[mid]) start=mid+1;
            else if(target<arr[mid]) end=mid-1;
            else if(target==arr[mid]) return arr[mid];
            if(start==end){
               index=start;
            }
        }

        if(target>arr[index]) return arr[index+1];
        else return arr[index];
    }

    static int find_Ceiling_Ideal_soln(int[] arr, int target){
        int start=0;
        int end =arr.length-1;

        if(arr[end]<target) {
            System.out.println("Greater than largest value");
            return arr[end];
        }

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target>arr[mid]) start=mid+1;
            else if(target<arr[mid]) end=mid-1;
            else if(target==arr[mid]) return arr[mid];
        }

        return arr[start];
    }
}
