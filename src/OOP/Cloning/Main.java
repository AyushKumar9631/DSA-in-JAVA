package OOP.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human h1= new Human(34,"Ayush");
        Human h2= new Human(h1);
        //above is cloning but takes much procession time

        Human Twin=(Human)h1.clone();
        System.out.println(Twin.age+" "+Twin.name);
        //but this is a shallow copy
        System.out.println(Arrays.toString(Twin.arr));
        Twin.arr[1]=100;
        System.out.println(Arrays.toString(h1.arr));
        //Deep copy requires creation of new DS on clone function
    }
}
