package Linear_search;

public class Linearsearch_in_range {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55,66,78};
        int start=1;
        int end=5;
        int target=10;
        System.out.println(LinearSearch(arr,start,end,target));
    }

    static boolean LinearSearch(int[] arr, int start, int end, int target){
        for(int i=start; i<=end; i++){
            if(target== arr[i]) return true;
        }
        return false;
    }
}
