package Linked_list;

public class LL {
    node head;
    node tail;
    int size;

    // constructors
    public LL(){
        this.size=0;
    }

    // insert beg
    public void insertFirst(int val){
        node N= new node(val);
        N.next=head;
        head= N;
        if(tail==null) tail=head;
        size++;
    }

    // insert last
    public void insertLast(int val){
        node N= new node(val);
        if(head==null){
            head=N;
            return;
        }
        node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = N;

    }

    //insert after
    public void insertAfter(int val, int n){
        int count =1;
        node temp=head;
        node N= new node(val);
        while(count<n){
            temp=temp.next;
            count++;
        }
        N.next=temp.next;
        temp.next=N;
    }

    //insert before
    public void insertbefore(int val, int n){
        int count =1;
        node temp=head;
        node N= new node(val);
        while(count<n-1){
            temp=temp.next;
            count++;
        }
        N.next=temp.next;
        temp.next=N;
    }

    //Delete beginning
    public void deletebeg(){
        if(head==null) System.out.println("List is already empty");
        else {
            head=head.next;
        }
    }

    //Delete end
    public void delete_end(){
        if(head==null) System.out.println("list is empty");
        else{
            node temp=head;
            while(temp.next.next!=null) temp=temp.next;
            temp.next=null;
        }
    }

    // delete at
    public void delete_at(int n){
        int count=1;
        node temp=head;
        while(count<n-1){
            temp=temp.next;
            count++;
        }
        temp.next=temp.next.next;
    }
    //display
    public void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

}
