//to find number of set bits in a number
package BitwiseOperators;

public class Count_SetBits {
    public static void main(String[] args) {
        int n=63;
        System.out.println(Integer.toBinaryString(n));
        int count=0;
        while(n>0){
            count++;
            int temp=n&(n*-1);
            n-=temp;
        }
        System.out.println(count);
    }
}
