package OOP;

import java.sql.SQLOutput;

public class Singleton {
    private Singleton(){
        System.out.println("Object of class in newly created");
    }
     static Singleton instance;

    public static Singleton getInstance(){
        if(instance==null) instance=new Singleton();
        return instance;
    }
}

class Main{
    public static void main(String[] args) {
        Singleton ob1= Singleton.getInstance();
        Singleton ob2= Singleton.getInstance();
        Singleton ob3= Singleton.getInstance();
    }
}
