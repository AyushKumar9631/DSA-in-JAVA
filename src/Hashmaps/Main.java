package Hashmaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map= new HashMap<>();
        map.put("kunal", 89);
        map.put("karan", 99);
        map.put("rahul", 78);
        System.out.println(map.get("karan"));
        System.out.println(map.getOrDefault("ayush",-1));

        //HashSet
        HashSet<Integer> set= new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(4);
        set.add(4);
        System.out.println(set);

        //treemap
        TreeMap<String, Integer> Tmap= new TreeMap<>();
        Tmap.put("kunal", 89);
        Tmap.put("karan", 99);
        Tmap.put("rahul", 78);
        System.out.println(Tmap);

        //own implementation
        Implementation map2= new Implementation();
        map2.put("mango", "King of fruit");
        map2.put("apple", "Keeps doctor away");
        map2.put("banana", "Lord of fruit");
        System.out.println(map2.get("banana"));

        //own better implementation
        HashMap_Chain<String, String> map3= new HashMap_Chain<>();
        map3.put("mango", "King of fruit");
        map3.put("apple", "Keeps doctor away");
        map3.put("banana", "Lord of fruit");
        System.out.println(map3.get("banana"));
        System.out.println(map3);
        System.out.println(map3.containsKey("mango"));
    }
}
