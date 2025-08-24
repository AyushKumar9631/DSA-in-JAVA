package LinkedList;

public class CircularLL {
    private Node head;
    private Node tail;

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insert(int val){
        Node node = new Node(val);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        node.next=head;
        tail.next=node;
        tail=node;
    }

    public void display(){
        Node temp= head;
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        do{
            System.out.print("["+temp.value+"] ->");
            temp=temp.next;
        }while(temp!=head);
        System.out.println("HEAD");
    }

    public void delete(int val){
        Node temp=head;
        boolean ispresent=false;
        do{
            if(temp.next.value==val){
                ispresent=true;
                break;
            }
            temp=temp.next;
        }while(temp!=head);
        if(!ispresent){
            System.out.println("Element "+ val+" is not present");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
        }
        if(temp.next==tail) tail=temp;
        temp.next=temp.next.next;
        if(temp==tail) head=temp.next;
    }
}
