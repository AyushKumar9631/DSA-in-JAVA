package Hashmaps;

public class Karp_Rabin_Matching {
    private final int PRIME=101;

    private double calculateHash(String s){
        double hash=0;
        for(int i=0; i<s.length(); i++){
            hash+=s.charAt(i)*Math.pow(PRIME,i);
        }
        return hash;
    }

    private double updateHash(double pVal, char oldChar, char newChar, int patternLen){
        double newHash=(pVal-oldChar)/PRIME;
        newHash+= newChar*Math.pow(PRIME,patternLen-1);
        return newHash;
    }

    public void search(String text, String pattern){
        int patternLen=pattern.length();
        double patternHash=calculateHash(pattern);
        double textHash= calculateHash(text.substring(0,patternLen));

        for(int i=0; i<=text.length()-patternLen; i++){
            if(textHash==patternHash){
                if(text.substring(i,i+patternLen).equals(pattern)) System.out.println("Pattern fount at index:" + i);
            }
            if(i<text.length()-patternLen) textHash=updateHash(textHash, text.charAt(i), text.charAt(i+patternLen), patternLen);
        }
    }
}
