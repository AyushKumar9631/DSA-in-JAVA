package Trees.Heap;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
//        Heap<Integer> heap= new Heap<>();
//        heap.insert(34);
//        heap.insert(45);
//        heap.insert(22);
//        heap.insert(89);
//        heap.insert(76);
////        System.out.println(heap.remove());
////        System.out.println(heap.remove());
////        System.out.println(heap.remove());
////        System.out.println(heap.remove());
//        ArrayList list= heap.heapSort();
//        System.out.println(list);
//        heap.remove();

        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(34);
        arr.add(45);
        arr.add(22);
        arr.add(89);
        arr.add(76);
        Heap<Integer> heap2= new Heap<>(arr);
        System.out.println(heap2.remove());
        System.out.println(heap2.remove());
        System.out.println(heap2.remove());
    }
}
