package Binary_search;

import java.util.Arrays;

public class Sorted_matrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,16,17}};
        int target=90;
        System.out.println(Arrays.toString(result(arr,target)));
        System.out.println(Arrays.toString(result_ideal(arr,target)));
    }

     static int[] result(int[][] arr, int target){
        int col=arr[0].length-1;
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(target>arr[mid][col]) start=mid+1;
            else if(target<arr[mid][col]) end=mid-1;
            else if(target==arr[mid][col]) return new int[]{mid,col};
        }

        int row1=end;
        int row2=start;
        if( row1>=0 && arr[row1][col]>target) return new int[]{row1, search_index(arr[row1],target)};
        else if(row2<arr.length) return new int[]{row2, search_index(arr[row2],target)};
        return new int[]{-1,-1};

     }

     static int[] result_ideal(int[][] matrix, int target){
        int rows= matrix.length;
        int cols= matrix[0].length;

        //be cautious matrix might 1D
         if(rows==1) {
             return search_index2(matrix,0,0,cols-1,target);
         }

         // run the loop till two rows are remaining
         int rStart=0;
         int rEnd= matrix.length-1;
         int cMid= cols/2;
         while(rStart<rEnd-1){
             int rMid=rStart+(rEnd-rStart)/2;
             if(matrix[rMid][cMid]==target) return new int[]{rMid,cMid};
             if(matrix[rMid][cMid]< target) rStart= cMid;
             else rEnd=rMid;
         }

         // now we have two rows
         // check whether the target is in the col of 2 rows
         if(matrix[rStart][cMid]==target) return new int[]{rStart,cMid};
         if(matrix[rStart+1][cMid]==target) return new int[]{rStart+1,cMid};

         //search in 1st half
         if(target<= matrix[rStart][cMid-1]) return search_index2(matrix,rStart,0,cMid-1,target);
         //search in 2nd half
         if(target>= matrix[rStart][cMid+1] && target<= matrix[rStart][cols-1]) return search_index2(matrix,rStart,cMid+1,cols-1,target);
         //search in 3rd half
         if(target<= matrix[rStart+1][cMid-1]) return search_index2(matrix,rStart+1,0,cMid-1,target);
         // search in 4th half
         else return search_index2(matrix,rStart+1,cMid+1,cols-1,target);
     }

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

    // search in row provided between column provided
    static int[] search_index2(int[][] matrix,int row, int cStart, int cEnd, int target){
        while(cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(matrix[row][mid]==target) return new int[]{row,mid};
            if(matrix[row][mid]<target) cStart=mid+1;
            else cEnd=mid-1;
        }
        return new int[]{-1,-1};
    }
}
