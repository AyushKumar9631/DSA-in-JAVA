package Reccursion;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String s="abcd";
        System.out.println(retpermCount("",s));
    }

    static void printperm(String p, String up){
        if(up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch= up.charAt(0);
        for(int i=0; i<=p.length(); i++){
            printperm(p.substring(0,i)+ch+p.substring(i),up.substring(1));
        }
    }

    static ArrayList<String> retperm(String p, String up){
        ArrayList<String> res= new ArrayList<>();
        if(up.isEmpty()) {
            res.add(p);
            return res;
        }
        char ch= up.charAt(0);
        for(int i=0; i<=p.length(); i++){
            res.addAll(retperm(p.substring(0,i)+ch+p.substring(i),up.substring(1)));
        }
        return res;
    }

    static int retpermCount(String p, String up){
        if(up.isEmpty()) {
            return 1;
        }
        int count=0;
        char ch= up.charAt(0);
        for(int i=0; i<=p.length(); i++){
            count+=(retpermCount(p.substring(0,i)+ch+p.substring(i),up.substring(1)));
        }
        return count;
    }
}
