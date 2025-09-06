package StringBufferAndBigInteger;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Introduction {
    public static void main(String[] args) {
        StringBuffer buffer= new StringBuffer();
        buffer.append("Hii i am learning about string buffer");
        buffer.insert(0,"this will be inserted last");
        buffer.replace(1,5,"this was replaced");
        buffer.reverse();
        buffer.delete(11,15);
        System.out.println(buffer);

        //some from string
        String s1="hii spaces will be removed from this line as underscore";
        System.out.println(s1.replaceAll("\\s","_"));
        String s2="Kumal ayush Ratnesh yash chinmay";
        System.out.println(Arrays.toString(s2.split(" ")));

        StringBuffer buffer2= new StringBuffer("This will append string on constructor");
        StringBuffer buffer3= new StringBuffer(15);

        //about decimalformat
        DecimalFormat formater= new DecimalFormat("00.000");
        System.out.println(formater.format(123.23274565768));
    }
}
