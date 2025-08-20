//find nth magic number
package BitwiseOperators;

import java.util.Scanner;

public class Nth_magicNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n= sc.nextInt();
        int res=0;
        int base=5;
        while(n>0){
            res=res+(n&1)*base;
            base*=5;
            n=n>>1;
        }
        System.out.println(res);
    }
}
