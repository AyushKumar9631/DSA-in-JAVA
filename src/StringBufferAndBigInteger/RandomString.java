package StringBufferAndBigInteger;

import java.util.Random;

public class RandomString {
    public static String generate(int n){
        Random random=new Random();
        StringBuffer str= new StringBuffer();
        for(int i=0; i<n; i++){
            str.append((char)(97+random.nextInt(0,25)));
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(generate(10));
    }

}
