package Some_Algorithms_and_practises;

import java.util.Arrays;

public class Mo_Algorithm {
    public static void main(String[] args) {
        int[] arr={1,3,5,2,7,6,3,1,4,8};
        int n=arr.length;

        //preprocessing
        int sqrt=(int)Math.sqrt(n);
        int[] blocks= new int[sqrt+1];
        int block_id=-1;
        for(int i=0; i<n; i++){
            if(i%sqrt==0) block_id++;
            blocks[block_id]+=arr[i];
        }
        System.out.println(Arrays.toString(blocks));
        System.out.println(query(arr,blocks,sqrt,2,7));
    }

    public static int query(int[] arr, int[] blocks, int sqrt, int l, int r){
        int ans=0;

        //calculate partial left block
        while(l%sqrt!=0 && l<r){
            ans+=arr[l];
            l++;
        }

        //calculate middle blocks
        while(l+sqrt<=r){
            ans+=blocks[l/sqrt];
            l+=sqrt;
        }

        //calculate partial right block
        while(l<=r){
            ans+=arr[l];
            l++;
        }
        return ans;
    }

    public static void update(int[] arr, int[] blocks, int i, int val, int sqrt){
        blocks[i/sqrt]+= (val-arr[i]);
        arr[i]=val;
    }
}
