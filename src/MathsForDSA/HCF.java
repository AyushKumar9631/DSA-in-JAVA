package MathsForDSA;

public class HCF {
    public static void main(String[] args) {
        System.out.println(hcf(105,224));
    }

    static int hcf(int a, int b){
        if(a==0) return b;
        return hcf(b%a,a);
    }
}
