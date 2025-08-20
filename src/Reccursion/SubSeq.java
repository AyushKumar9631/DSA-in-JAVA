package Reccursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSeq {
    public static void main(String[] args) {
//        //sample
//        String s="abc";
//        //printing subseq
//        subseq(s,"");
//        System.out.println();
//        //returning sunseq
//        ArrayList<String> res= returnSubseq(s,"");
//        System.out.println(res);
//        //printing subseq with ascii
//        subseqAscii(s,"");
//        System.out.println();
//        //returning subseq with ascii
//        System.out.println(returnSubseqAscii(s,""));

        int[] arr={1,2,2};
        List<List<Integer>> ans= subset(arr);
        for(List<Integer> list: ans) System.out.print(list+" ");

        System.out.println();

        int[] arr1={1,2,2};
        List<List<Integer>> ans1= dupSubset(arr1);
        for(List<Integer> list: ans1) System.out.print(list+" ");
    }

    static void subseq(String up, String p){
        if(up.isEmpty()) System.out.print(p+" ");
        else{
            subseq(up.substring(1), p+up.charAt(0));
            subseq(up.substring(1), p);
        }
    }

    static ArrayList<String> returnSubseq(String up, String p){
        if(up.isEmpty()){
         ArrayList<String> res= new ArrayList<>();
         res.add(p);
         return res;
        }
        else{
             ArrayList<String> left= returnSubseq(up.substring(1), p+up.charAt(0));
            ArrayList<String> right= returnSubseq(up.substring(1), p);
            left.addAll(right);
            return left;
        }
    }

    static void subseqAscii(String up, String p){
        if(up.isEmpty()) System.out.print(p+" ");
        else{
            subseqAscii(up.substring(1), p+up.charAt(0));
            subseqAscii(up.substring(1), p);
            subseqAscii(up.substring(1), p+(int)up.charAt(0));
        }
    }

    static ArrayList<String> returnSubseqAscii(String up, String p){
        if(up.isEmpty()){
            ArrayList<String> res= new ArrayList<>();
            res.add(p);
            return res;
        }
        else{
            ArrayList<String> first= returnSubseqAscii(up.substring(1), p+up.charAt(0));
            ArrayList<String> second = returnSubseqAscii(up.substring(1), p);
            ArrayList<String> thired= returnSubseqAscii(up.substring(1),p+(int)up.charAt(0));
            first.addAll(second);
            first.addAll(thired);
            return first;
        }
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer= new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n=outer.size();
            for(int i=0; i<n; i++){
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    static List<List<Integer>> dupSubset(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer= new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int i=0; i<arr.length; i++){
            int n=outer.size();
            int s=0;
            if(i>0 && arr[i]==arr[i-1]) s=n/2;
            for(int j=s; j<n; j++){
                List<Integer> internal=new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }

}
