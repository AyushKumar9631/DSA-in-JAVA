package Linked_list;

public class Fifth_question {
    public static void main(String[] args) {
        LL l1= new LL();
        LL l2= new LL();
        LL l3= new LL();

        l1.insertLast(1);
        l1.insertLast(3);
        l1.insertLast(5);
        l2.insertFirst(2);
        l2.insertLast(4);
        l2.insertLast(6);
        l1.display();
        System.out.println();
        l2.display();
        System.out.println();

        node temp1=l1.head;
        node temp2=l2.head;
        boolean t1c=true;
        boolean t2c=true;
        while(t1c || t2c){
                if(temp1.value<temp2.value && t1c){
                    l3.insertLast(temp1.value);
                    if(temp1.next!=null) temp1=temp1.next;
                    else t1c=false;
                }
                else if(t2c){
                     l3.insertLast(temp2.value);
                     if(temp2.next != null) temp2= temp2.next;
                     else t2c=false;
                }
        }
        l3.display();
    }
}
