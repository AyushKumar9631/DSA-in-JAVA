//find ith bit of a number
package BitwiseOperators;

import java.util.Scanner;

public class ith_Bit {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println("Enter the value of i from right");
        int i=sc.nextInt();
        int x=1;
        x=x<<i-1;

        if((x & num)==0) System.out.println(0);
        else System.out.println(1);
    }
}
