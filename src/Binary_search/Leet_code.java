package Binary_search;

public class Leet_code {
    public static void main(String[] args) {
        int[] nums={7,2,5,10,8};
        int k=2;
        System.out.println(splitArray(nums,k));
    }

    public static int splitArray(int[] nums, int k) {
        int start=Integer.MIN_VALUE;
        int end=0;

        for(int i: nums){
            start= Math.max(start,i);
            end+= i;
        }

        while(start!=end){
            int mid=start+(end-start)/2;
            int pieces= count_piece(nums,mid);
            System.out.println(pieces);
            if(pieces>k) start=mid+1;
            if(pieces<=k) end=mid;
        }
        return start;
    }

    public static int count_piece(int[] nums, int mid){
        int sum=0;
        int count=0;
        for(int i=0; i<nums.length; i++){
            sum+= nums[i];
            if( i<nums.length-1 && sum+nums[i+1]>mid){
                count++;
                sum=0;
            }
            else if(i==nums.length-1){
                if(sum>mid) count+=2;
                else count++;

            }
        }
        return count;
    }
}
