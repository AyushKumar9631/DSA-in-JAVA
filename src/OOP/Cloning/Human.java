package OOP.Cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    Human(int age, String name){
        this.age=age;
        this.name=name;
        arr=new int[]{1,2,3,4,5};
    }
    Human(Human h){
        this.age=h.age;
        this.name=h.name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
