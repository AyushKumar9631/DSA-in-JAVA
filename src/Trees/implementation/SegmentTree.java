package Trees.implementation;

public class SegmentTree {
    public class Node{
        private int data;
        private int startinterval;
        private int endinterval;
        Node left;
        Node right;

        public Node(int startinterval, int endinterval){
            this.startinterval=startinterval;
            this.endinterval=endinterval;
        }
    }
    Node root;
    public SegmentTree(int[] arr){
        this.root=constructTree(arr,0 ,arr.length-1);
    }

    //create tree
    private Node constructTree(int[] arr, int start, int end){
        if(start==end){
            Node leaf= new Node(start, end);
            leaf.data=arr[start];
            return leaf;
        }
        //create a node with index you already at
        Node node=new Node(start, end);
        int mid=(start+end)/2;
        node.left=constructTree(arr,start,mid);
        node.right=constructTree(arr,mid+1,end);
        node.data= node.left.data +node.right.data;
        return node;
    }

    //display
    public void display(){
        display(root);
    }
    private void display(Node node){
        String str="";

        if(node.left!=null){
            str=str+"Interval=["+node.left.startinterval+" - "+ node.left.endinterval+"] and data: "+ node.left.data+" => ";
        }
        else{
            str=str+"no left child";
        }

        str=str+"Interval=["+node.startinterval+" - "+node.endinterval+"] and data: "+node.data+" =>";

        if(node.right!=null){
            str=str+"Interval=["+node.right.startinterval+" - "+ node.right.endinterval+"] and data: "+ node.right.data;
        }
        else{
            str=str+"no right child";
        }
        System.out.println(str+"\n");
        if(node.left!=null) display(node.left);
        if(node.right!=null) display(node.right);
    }

    //query tree
    public int query(int start, int end){
        return query(root,start,end);
    }
    private int query(Node node, int start, int end){
        //case 1: if completely inside
        if(node.startinterval>=start && node.endinterval<=end) return node.data;

        //completely outside
        else if(node.startinterval>end || node.endinterval<start) return 0;

        else return query(node.left,start,end)+query(node.right, start,end);
    }

    //update
    public void update(int val, int in){
        root.data=update(root,val,in);
    }
    private int update(Node node, int val, int in){
        if(in>=node.startinterval && in<=node.endinterval){
            if(node.startinterval==node.endinterval){
                node.data=val;
                return node.data;
            }
            else{
                node.data=update(node.left,val,in)+update(node.right,val,in);
                return node.data;
            }
        }
        else return node.data;
    }
}
