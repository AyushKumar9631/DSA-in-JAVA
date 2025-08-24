package LinkedList;

public class DoublyLL {
    private Node head;
    private Node tail;
    private int size;
    DoublyLL(){
        this.size=0;
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev=prev;
        }
    }

    public void insertFirst(int val){
        Node node= new Node(val);
        if(head==null){
            head=node;
            tail=node;
        }
        else{
            node.next=head;
            head.prev=node;
            head=node;
        }
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

    public void displayReverse(){
        Node temp= tail;
        while(temp!=null){
            System.out.print("["+temp.value+"] <- ");
            temp=temp.prev;
        }
        System.out.println("START");
    }

    //without tail
    public void insertLast(int val){
        if(head==null){
            insertFirst(val);
            return;
        }
        Node last=head;
        while(last.next!=null) last=last.next;
        Node node= new Node(val);
        last.next=node;
        node.prev=last;
        //just to update tail
        tail=node;
        size++;
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

    public Node find(int val){
        Node temp=head;
        while(temp!=null){
            if(temp.value==val) return temp;
            temp=temp.next;
        }
        return null;
    }

    //insert after given value
    public void insertAfter(int afterval, int val){
        Node p= find(afterval);
        if(p==null){
            System.out.println("Node does'nt exists");
            return;
        }
        if(p==tail){
            insertLast(val);
            return;
        }
        Node node =new Node(val);
        node.next=p.next;
        node.next.prev=node;
        p.next=node;
        node.prev=p;
        size++;
    }
}
