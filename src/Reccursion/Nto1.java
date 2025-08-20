package Reccursion;

public class Nto1 {
    public static void main(String[] args) {
        nto1(12);
        System.out.println();
        oneToN(12);
        System.out.println();
        both(12);
    }
    static void nto1(int n){
        System.out.print(n+" ");
        if(n!=1) nto1(n-1);
    }

    static void oneToN(int n){
        if(n!=1) oneToN(n-1);
        System.out.print(n+" ");
    }

    static void both(int n){
        System.out.print(n+" ");
        if(n!=1) both(n-1);
        System.out.print(n+" ");
    }
}
