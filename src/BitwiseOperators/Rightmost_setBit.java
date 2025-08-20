//find rightmost set bit of a number
package BitwiseOperators;

public class Rightmost_setBit {
    public static void main(String[] args) {
        //number of your choice
        int a=10;

        if(a==0) System.out.println(0);
        else {
            int b = a * -1;
            int c = a & b;

            int temp = 1;
            int res = 1;
            while (temp != c) {
                res++;
                temp *= 2;
            }
            System.out.println(res);
        }
    }
}
