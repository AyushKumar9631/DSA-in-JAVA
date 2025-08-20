package MathsForDSA;

import static MathsForDSA.HCF.hcf;

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(10,15));
    }

    static int lcm(int a, int b){
       int x= HCF.hcf(a,b);
       return (a*b)/x;
    }
}
