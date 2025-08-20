package Linear_search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= {15, 44, 46,64,646,46};
        int target=64;
        System.out.println(Linear_search(arr,target));
        System.out.println(Linear_Search(arr,target));
        System.out.println(Linearsearch(arr,target));
    }

    // search the target and return index
    static int Linear_search(int[] arr, int target){
        if(arr.length==0) return -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    // search and return element
    static int Linear_Search(int[]arr, int target){
        if(arr.length==0) return Integer.MAX_VALUE;

        for (int i: arr){
            if(target==i) return i;
        }

        return Integer.MAX_VALUE;
    }

    //search and return true and false
    static boolean Linearsearch(int[]arr, int target){
        if(arr.length==0) return false;

        for(int i: arr){
            if (target== i) return true;
        }
        return false;
    }
}
