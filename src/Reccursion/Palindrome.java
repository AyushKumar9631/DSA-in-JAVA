package Reccursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("applppa"));
    }

    static  boolean palindrome(String word){
        if(word.length()<=1) return true;
        if(word.charAt(0)!=word.charAt(word.length()-1)) return false;
        return palindrome(word.substring(1,word.length()-1));
    }
}
