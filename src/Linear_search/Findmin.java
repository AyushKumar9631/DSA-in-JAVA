package Linear_search;

public class Findmin {
    public static void main(String[] args) {
        int[] arr={18,12,-7,3,14,28};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    static int min (int[] arr){
        int min=arr[0];
        for(int i: arr){
            if(i<min) min=i;
        }
        return min;
    }

    static int max(int[] arr){
        int max=arr[0];
        for(int i: arr){
            if(i>max) max=i;
        }
        return max;
    }
}
