package MathsForDSA;

import java.util.ArrayList;
import java.util.List;

public class Factors {
    public static void main(String[] args) {
        factor1(36);
        System.out.println();
        factor2(36);
        System.out.println();
        factor3(36);
    }

    //O(n)
    static void factor1(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0) System.out.print(i+" ");
        }
    }

    //O(sqrt(n))
    static void factor2(int n){
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                if(n/i==i) System.out.print(i+" ");
                else System.out.print(i+" "+n/i+" ");
            }
        }
    }

    //both space and time complexity 0(sqrt(N))
    static void factor3(int n){
        List<Integer> order= new ArrayList<>();
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                if(n/i==i) System.out.print(i+" ");
                else{
                    System.out.print(i+" ");
                    order.add((int)n/i);
                }
            }
        }
        for(int i=order.size()-1; i>=0; i--){
            System.out.print(order.get(i)+" ");
        }
    }
}
