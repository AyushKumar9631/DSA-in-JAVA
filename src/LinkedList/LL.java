package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;
    LL(){
        this.size=0;
    }

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

    public void insertFirst(int val){
        Node node= new Node(val, head);
        head=node;
        if(tail==null) tail=node;
        size++;
    }

    public void display(){
        Node temp= head;
        while(temp!=null){
            System.out.print("["+temp.value+"] -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public void insertLast(int val){
        if(tail==null) insertFirst(val);
        else{
            Node node= new Node(val);
            tail.next=node;
            tail=node;
            size++;
        }
    }

    public void insertAt(int val, int in){
        if(in>=size){
            System.out.println("Index out of bound");
            return;
        }
        else if(in==0) insertFirst(val);
        else if(in==size) insertLast(val);
        else{
            Node temp=head;
            while(in>1){
                temp=temp.next;
                in--;
            }
            Node node= new Node(val, temp.next);
            temp.next=node;
            size++;
        }
    }

    public int deleteFirst(){
        if(size==0){
            System.out.println("List already empty");
            return -1;
        }
        int val= head.value;
        head=head.next;
        if(head==null) tail=null;
        size--;
        return val;
    }

    public Node get(int in){
        if(in>=size){
            System.out.println("Array index out of bound");
            return null;
        }
        Node temp=head;
        for(int i=0; i<in; i++){
            temp=temp.next;
        }
        return temp;
    }

    public int deleteLast(){
        if(size<=1) return deleteFirst();
        Node secondLast=get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        size--;
        return val;
    }

    public int deleteAt(int in){
        if(in>=size){
            System.out.println("Index out of bound");
            return-1;
        }
        if(in==0) return deleteFirst();
        if(in==size-1) return deleteLast();
        Node prev=get(in-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        size--;
        return val;
    }

    public Node find(int val){
        Node temp=head;
        while(temp!=null){
            if(temp.value==val) return temp;
            temp=temp.next;
        }
        return null;
    }
}
