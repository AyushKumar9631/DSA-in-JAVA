package OOP.Comaprators;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LamdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0; i<5; i++) arr.add(i+1);

        Consumer<Integer> fun= (item)-> System.out.println(2*item);
        arr.forEach(fun);

        operation sum=(a,b)->a+b;
        operation diff=(a,b)->a-b;
        System.out.println(operate(5,3,sum));
        System.out.println(operate(5,3,diff));

    }
    private static int operate(int a, int b, operation o){
        return o.op(a,b);
    }
}

interface operation{
    int op(int a, int b);
}
