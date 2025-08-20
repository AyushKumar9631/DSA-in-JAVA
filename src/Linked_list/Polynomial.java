package Linked_list;

import java.util.Scanner;

public class Polynomial {

    public class Node{
        int val;
        int pow;
        Node next;

        Node(int val, int pow){
            this.val=val;
            this.pow=pow;
        }
    }

    Node head;

    public void create(int n){
        Scanner in = new Scanner(System.in);
        for(int i=0; i<=n; i++){
            System.out.println("Enter coefficient of X with power "+i);
            int val=in.nextInt();
            Node N=new Node(val,i);
            N.next=head;
            head=N;
        }
    }

    public void display(){
        if(head==null) System.out.println(0);
        else{
            Node temp=head;
            while(temp.next!=null){
                System.out.print(temp.val+"x^"+temp.pow+" + ");
                temp=temp.next;
            }
            System.out.println(temp.val);
        }
    }
}
