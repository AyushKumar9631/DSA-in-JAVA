package LinkedList;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        LL list= new LL();
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(5);
//        list.insertLast(18);
//        list.insertAt(15,3);
//        list.insertAt(56,2);
//        //list.display();
//        list.insertrec(69,2);
//        //list.display();
//        list.insertrec(44,0);
//        //list.display();
//        list.insertrec2(61,2);
//        //list.display();
//        list.insertrec2(72,0);
//        list.display();
//        list.reverseRec();
//        list.display();
//        list.reverseItr();
//        list.display();
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.deleteAt(1));
//        list.display();

//        DoublyLL list= new DoublyLL();
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(5);
//        list.insertLast(55);
//        list.display();
//        list.insertAfter(3,8);
//        list.display();
//        list.displayReverse();

//        CircularLL list= new CircularLL();
//        list.insert(3);
//        list.insert(4);
//        list.insert(5);
//        list.insert(55);
//        list.display();
//        list.delete(5);
//        list.display();

        //Alternate k reversal
        for(int i=1; i<10; i++){
            list.insertLast(i);
        }
        list.display();
        list.reverseKGroup(2);
        list.display();
    }
}
