package Reccursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(12345));
    }

    static int sum(int n){
        if(n>=0 && n<=9) return n;
        return n%10+sum(n/10);
    }
}
