package Linear_search;

public class Max_in_2D_array {
    public static void main(String[] args) {
        int[][] arr={
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        System.out.println(max(arr));
    }

    static int max(int[][] arr){
        int max=arr[0][0];
        for (int[] i : arr) {
            for (int j = 0; j < i.length; j++) {
                if (i[j] > max) max = i[j];
            }
        }
        return max;
    }
}
