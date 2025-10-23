package Hashmaps;

public class Driver_Huffmann {
    public static void main(String[] args) throws Exception {
        String s="aaaabbbccd";
        Huffmann_Econder encoder= new Huffmann_Econder(s);
        String es=encoder.encode(s);
        System.out.println(es);
        System.out.println(encoder.decode(es));
    }
}
