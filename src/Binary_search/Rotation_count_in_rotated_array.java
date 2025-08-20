package Binary_search;

public class Rotation_count_in_rotated_array {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,2};
        System.out.println(find_Rotation(arr));
    }

    static int find_Rotation(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) return mid+1;
            else if (mid > start && arr[mid] < arr[mid - 1]) return mid;
            else if (arr[mid] <= arr[start]) end = mid - 1;
            else if (arr[mid] > arr[start])
                start = mid + 1; //because if mid would have been pivot it would have been returned
        }
        return 0;
    }
}
