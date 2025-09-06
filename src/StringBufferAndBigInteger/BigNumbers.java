package StringBufferAndBigInteger;

import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {
        int a=30;
        int b=67;

        BigInteger A= BigInteger.valueOf(a);
        int c=A.intValue();
        BigInteger B= BigInteger.valueOf(122131243);
        BigInteger C= new BigInteger("132465897324567");

        //contants
        BigInteger D= BigInteger.TEN;

        //addition
        BigInteger E=C.add(B);
        System.out.println(E);

        //multiplication and more
        System.out.println(C.multiply(A));
        System.out.println(C.remainder(A));
        System.out.println(C.divide(A));

        //comparision
        if(C.compareTo(A)>0) System.out.println("C is greater");
        else System.out.println("A is greater");

        System.out.println(factorial(23356));

    }

    static BigInteger factorial(int num){
        BigInteger ans=new BigInteger("1");
        for (int i = 2; i <= num; i++) {
            ans=ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }
}
