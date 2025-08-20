package com.ayush;

import java.util.ArrayList;

import java.util.Scanner;

public class Array_list {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list= new ArrayList<>(10);
        // or ArrayList<Integer> list= new ArrayList<integer>();
        // 10 is actually default size it,s optional to provide and is changed
        // or ArrayList<> list= new ArrayList<>()  but this is not a good practise

        list.add(67);
        list.add(45);
        list.add(45);
        list.add(42);
        list.add(456);
        list.add(553);
        list.add(4523);
        list.add(42);
        list.add(455);
        list.add(23);
        list.add(6745);
        list.add(67586);
//        int[] apple= list.toArray();

        System.out.println(list);

        boolean a= list.contains(533); // checks whether a element is present in the list

        list.set(0, 99);  // updates 0th index with 99
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        //input
        for(int i=0; i<5; i++){
            list.add(in.nextInt());
        }

        // output
        for(int i=0; i<16; i++){
            System.out.println(list.get(i));
        }




    }
}
