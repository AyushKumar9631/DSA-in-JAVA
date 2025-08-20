//to find a to the power of b
package BitwiseOperators;

public class pow_a_b {
    public static void main(String[] args){
        int n=6;
        int base=3;
        int ans=1;
        while(n>0){
            if((n&1)==1) ans*=base;
            base=base*base;
            n=n>>1;
        }
        System.out.println(ans);
    }

}
