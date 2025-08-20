//to reset ith bit
package BitwiseOperators;

import java.util.Scanner;

public class Reset_ithBit {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println("Enter the value of i from right to reset");
        int i=sc.nextInt();
        int x=1;
        x=x<<i-1;
        x=~x;
        System.out.println(num&x);
    }
}
