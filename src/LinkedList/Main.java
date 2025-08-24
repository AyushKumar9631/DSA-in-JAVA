package LinkedList;

public class Main {
    public static void main(String[] args) {
//        LL list= new LL();
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(5);
//        list.insertLast(18);
//        list.insertAt(15,3);
//        list.insertAt(56,2);
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

        CircularLL list= new CircularLL();
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(55);
        list.display();
        list.delete(5);
        list.display();
    }
}
