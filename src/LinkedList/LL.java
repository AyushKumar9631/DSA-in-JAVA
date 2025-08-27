package LinkedList;

public class LL {

    private ListNode head;
    private ListNode tail;
    private int size;
    LL(){
        this.size=0;
    }

    private class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        ListNode listNode = new ListNode(val, head);
        head= listNode;
        if(tail==null) tail= listNode;
        size++;
    }

    public void display(){
        ListNode temp= head;
        while(temp!=null){
            System.out.print("["+temp.val +"] -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public void insertLast(int val){
        if(tail==null) insertFirst(val);
        else{
            ListNode listNode = new ListNode(val);
            tail.next= listNode;
            tail= listNode;
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
            ListNode temp=head;
            while(in>1){
                temp=temp.next;
                in--;
            }
            ListNode listNode = new ListNode(val, temp.next);
            temp.next= listNode;
            size++;
        }
    }

    public int deleteFirst(){
        if(size==0){
            System.out.println("List already empty");
            return -1;
        }
        int val= head.val;
        head=head.next;
        if(head==null) tail=null;
        size--;
        return val;
    }

    public ListNode get(int in){
        if(in>=size){
            System.out.println("Array index out of bound");
            return null;
        }
        ListNode temp=head;
        for(int i=0; i<in; i++){
            temp=temp.next;
        }
        return temp;
    }

    public int deleteLast(){
        if(size<=1) return deleteFirst();
        ListNode secondLast=get(size-2);
        int val=tail.val;
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
        ListNode prev=get(in-1);
        int val=prev.next.val;
        prev.next=prev.next.next;
        size--;
        return val;
    }

    public ListNode find(int val){
        ListNode temp=head;
        while(temp!=null){
            if(temp.val ==val) return temp;
            temp=temp.next;
        }
        return null;
    }

    //insert using recursion
    public void insertrec(int val, int in){
        fxn_insertrec(val,in,head);
    }
    private void fxn_insertrec(int val, int in, ListNode curr){
        if(in==0){
            ListNode listNode =new ListNode(val);
            listNode.next=head;
            head= listNode;
            size++;
            return;
        }
        if(in==1){
            ListNode listNode =new ListNode(val);
            listNode.next=curr.next;
            curr.next= listNode;
            size++;
            return;
        }
        fxn_insertrec(val,in-1,curr.next);
    }

    //insert using recsursion by K.K
    public void insertrec2(int val, int in){
        head=fxn_recKK(val,in,head);
    }
    private ListNode fxn_recKK(int val, int in, ListNode curr){
        if(in==0){
            ListNode listNode = new ListNode(val,curr);
            size++;
            return listNode;
        }
        curr.next=fxn_recKK(val,in-1,curr.next);
        return curr;
    }

    //Reversing a LL via recursion
    public void reverseRec(){
        fxnreverseRec(head);
    }
    private void fxnreverseRec(ListNode listNode){
        if(listNode ==tail){
            head=tail;
            return;
        }
        fxnreverseRec(listNode.next);
        tail.next= listNode;
        tail= listNode;
        tail.next=null;
    }

    //Reversing via iteration
    public void reverseItr(){
        if(size==0 || size==1) return;
        ListNode prev=null;
        ListNode curr=head;
        ListNode next= head.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null) next=next.next;
        }
        //swapping head and tail
        tail=head;
        head=prev;
    }

    //Alternate k reversal
    public ListNode reverseKGroup( int k) {
         ListNode head=this.head;
        boolean turn=true;
        ListNode temp=head;
        int left=1;
        int right=1;
        while(temp!=null){
            while(temp!=null && right<left+k-1){
                right++;
                temp=temp.next;
            }
            if(temp==null) return head;
            temp=temp.next;
            if(turn) head= reverseBetween(head, left, right);
            left=right+1;
            right=left;
            turn=!turn;
        }
        return head;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right) return head;
        ListNode LEFT=null;
        ListNode RIGHT=null;
        ListNode prev=null;
        ListNode curr=null;
        ListNode next=null;
        //finding initial values of all parameters
        ListNode temp=head;
        while(temp!=null){
            if(left==2) LEFT= temp;
            if(left==1){
                curr=temp;
            }
            if(right==1){
                RIGHT=temp.next;
                temp.next=null;
                break;
            }
            temp=temp.next;
            right--;
            left--;
        }
        next=curr.next;

        //reversing given LL
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null) next=next.next;
        }

        //linking back together
        if(LEFT!=null){
            LEFT.next.next=RIGHT;
            LEFT.next=prev;
            return head;
        }
        else{
            head.next=RIGHT;
            return prev;
        }
    }

}
