//searching in row wise and column wise sorted array;
package Binary_search;

import java.util.Arrays;

public class Searching_in_2D {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40}, {15, 25, 35, 45}, {28, 29, 37, 49}, {33, 34, 38, 50}};
        int target=49;
        int[] ans= search2D(arr,target);
        System.out.println(Arrays.toString(ans));
        int[] ans2= search2D_ideal(arr,target);
        System.out.println(Arrays.toString(ans2));
    }

    static int[] search2D(int[][] arr, int target) {
        int lb = 0;
        int ub = arr[0].length - 1;
        while (lb < arr.length && ub >= 0) {
            int start = lb;
            int end = ub;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target > arr[lb][mid]) start = mid + 1;
                else if (target < arr[lb][mid]) end = mid - 1;
                else if (target == arr[lb][mid]) return new int[]{lb,mid};
            }

            lb++;
            ub=end;
        }
        return new int[] {-1,-1};
    }

    static int[] search2D_ideal(int[][] arr, int target){
        int r=0;
        int c= arr.length-1;

        while(r<arr.length && c>=0){
            if(arr[r][c]==target) return new int[]{r,c};
            if(arr[r][c]<target) r++;
            else c--;
        }
        return new int[]{-1,-1};
    }
}
