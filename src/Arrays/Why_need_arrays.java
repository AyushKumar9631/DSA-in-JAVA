package com.ayush;

public class Why_need_arrays {
    public static void main(String[] args) {
        // Q: store a roll number
        int a= 19;

        // Q: store a person's name
        String name= "Ayush kumar";

        // Q: store 5 roll numbers
        int a1= 12;
        int a2= 15;
        int a3= 89;
        int a4= 56;
        int a5= 67;

        // Q: store 500 roll numbers
        // that's why we need arrays

        // syntax
        // datatype[] Variable_name = new datatype[size];
        int[] rnos= new int[5];
        // or directly
        int[] rnos2= {12,34,55,67,23};

        // How it works?
        int[] array; // initialization of variable array in stack memory, currently not pointing towards anything. (Happens at compile time)
        array= new int[6]; // creation of actual object in heap memory. (happens at runtime)

        System.out.println(rnos2[3]); // 67

        String[] arr= new String[5];
        System.out.println(arr[3]);  // null :Default value

    }
}
