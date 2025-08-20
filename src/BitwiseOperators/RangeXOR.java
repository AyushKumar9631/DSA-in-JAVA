//to find xor of numbers in given range
package BitwiseOperators;

public class RangeXOR {
    public static void main(String[] args) {
        int a=3;
        int b=9;
        int x=XOR(b);
        int y=XOR(a-1);
        int ans=x^y;
        System.out.println(ans);

    }

    static int XOR(int a){
        int rem=a%4;
        if(rem==0) return a;
        else if(rem==1) return 1;
        else if(rem==2) return a+1;
        else return 0;
    }
}
