//to find whether number is odd or even using bitwise operator
package BitwiseOperators;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        if((a&1)==1) System.out.println("Odd");
        else System.out.println("Even");
    }
}
