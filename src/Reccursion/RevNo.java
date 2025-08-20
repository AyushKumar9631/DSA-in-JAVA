package Reccursion;

public class RevNo {
    public static void main(String[] args) {
        System.out.println(rev(12345,5));
    }

    static int rev(int n, int d){
        if(d==1) return n;
        int x= (n%10) * (int)Math.pow(10,d-1)+rev(n/10,d-1);
        return x;
    }
}
