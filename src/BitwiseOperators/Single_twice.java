//given an array where except for one rest appears twice find the single number
package BitwiseOperators;

public class Single_twice {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 1, 4, 10};
        int res=0;

        //performing xor will give the number
        for(int i: arr){
            res=res^i;
        }
        System.out.println(res);
    }
}
