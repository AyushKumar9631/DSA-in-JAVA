package OOP.ArrayList_implementation;

public class Main {
    public static void main(String[] args) {
//        CustomArrayList list= new CustomArrayList();
//        list.add(10);
//        list.add(20);
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.size());
//        System.out.println(list.remove());
//        System.out.println(list.get(1));
        CustomGenArrayList<String> list2= new CustomGenArrayList<>();
        list2.add("apple");
        list2.add("ball");
        System.out.println(list2.get(1));
        System.out.println(list2.size());
    }
}
