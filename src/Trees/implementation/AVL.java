package Trees.implementation;

public class AVL {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value=value;
            height=0;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;
    public AVL(){

    }
    //get height
    public int height(Node node){
        if(node==null) return-1;
        return node.height;
    }
    //isEmpty
    public boolean isEmpty(){
        return root==null;
    }
    //display
    public void display(){
        display(root, "Root node: ");
    }
    private void display(Node node, String detail){
        if(node==null) return;
        System.out.println(detail+node.value +" height:"+height(node));
        display(node.left, "Left child of "+node.value+": ");
        display(node.right, "Right child of "+node.value+": ");
    }
    //insert
    public void insert(int value){
        root=insert(root,value);
    }
    private Node insert(Node node, int val){
        if(node==null){
            node=new Node(val);
            return node;
        }
        if(node.value>val) node.left=insert(node.left, val);
        else if(node.value<val) node.right=insert(node.right, val);

        node.height=Math.max(height(node.left), height(node.right))+1;
        return rotate(node);
    }
    //rotate
    private Node rotate(Node node){
        if(height(node.left)-height(node.right)>1){
            //left heavy
            if(height(node.left.left)-height(node.left.right)>0){
                //left left case
                return rightRotate(node);
            }
            if(height(node.left.left)-height(node.left.right)<0){
                //left right case
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if(height(node.left)-height(node.right)<-1){
            //right heavy
            if(height(node.right.left)-height(node.right.right)<0){
                //right right case
                return leftRotate(node);
            }
            if(height(node.right.left)-height(node.right.right)>0){
                //right left case
                node.right=rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }
    //leftRotate
    private Node leftRotate(Node p){
        Node c=p.right;
        Node t=c.left;
        c.left=p;
        p.right=t;
        p.height=Math.max(height(p.left),height(p.right))+1;
        c.height=Math.max(height(c.left),height(c.right))+1;
        return c;
    }
    //rightRotate
    private Node rightRotate(Node p){
        Node c=p.left;
        Node t=c.right;
        c.right=p;
        p.left=t;
        p.height=Math.max(height(p.left),height(p.right))+1;
        c.height=Math.max(height(c.left),height(c.right))+1;
        return c;
    }
    //balanced or not
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node==null) return true;
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }
    //insert multiple items at once
    public void populate(int[] nums){
        for (int i: nums){
            insert(i);
        }
    }
    //inserting sorted array
    public void populateSortedArray(int[] nums){
        populateSortedArray(nums,0,nums.length);
    }
    private void populateSortedArray(int[] nums, int s, int e){
        if(s>=e) return;
        int mid=(s+e)/2;
        insert(nums[mid]);
        populateSortedArray(nums,s,mid-1);
        populateSortedArray(nums,mid+1,e);
    }
}
