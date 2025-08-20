package Linked_list;

public class main {
    public static void main(String[] args) {
        LL list= new LL();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertLast(24);
        list.insertLast(35);
        list.insertAfter(6,3);
        list.insertbefore(1,3);
        list.deletebeg();
        list.delete_end();
        list.delete_at(2);
        list.display();
        display_at(1,list);

//        node temp=list.head;
//        while(temp.next!=null) temp=temp.next;
//        temp.next=list.head;
//        System.out.println(is_open(list));


    }

    public static void display_at(int n, LL list){
        int count=1;
        node temp=list.head;
        while(count!=n){
            temp=temp.next;
            count++;
        }
        System.out.println(temp.value);
    }

    public static boolean is_open(LL list){
        node temp=list.head.next;
        while(temp.next!=null){
            if(temp==list.head) return false;
            temp=temp.next;
        }
        return true;
    }
}
