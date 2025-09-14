package Trees.implementation;

import java.util.*;

public class BinaryTree {
    private Node root;
    public BinaryTree(){

    }

    private class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    //insert elements
    public void populate(Scanner sc){
        System.out.println("Enter the root node Val:");
        int val=sc.nextInt();
        root=new Node(val);
        populate(sc, root);
    }
    public void populate(Scanner sc, Node parent){
        System.out.println("Do you want to enter left of "+ parent.value);
        if(sc.nextBoolean()){
            System.out.println("Enter the value");
            Node left= new Node(sc.nextInt());
            parent.left=left;
            populate(sc,left);
        }

        System.out.println("Do you want to enter right of "+ parent.value);
        if(sc.nextBoolean()){
            System.out.println("Enter the value");
            Node right= new Node(sc.nextInt());
            parent.right=right;
            populate(sc,right);
        }
    }

    //display
    public void display(){
        display(root, "");
    }
    private void display(Node parent, String indent){
        if(parent==null) return;
        System.out.println(indent+parent.value);
        display(parent.left, indent+"\t");
        display(parent.right, indent+"\t");
    }

//    preety display
    public void prettyDisplay(){
        prettyDisplay(root,0);
    }
    private void prettyDisplay(Node node, int level){
        if(node==null) return;

        prettyDisplay(node.right, level+1);
        if(level!=0){
            for(int i=0; i<level-1; i++){
                System.out.print("|\t\t");
            }
            System.out.println("----------->"+node.value);
        }
        else{
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level+1);
    }

    //preorder traversal
    public void preorder(){
        preorder(root);
        System.out.println();
    }
    private void preorder( Node node){
        if(node==null) return;
        System.out.print(node.value +" ");
        preorder(node.left);
        preorder(node.right);
    }

    //inorder traversal
    public void inorder(){
        inorder(root);
        System.out.println();
    }
    private void inorder( Node node){
        if(node==null) return;
        inorder(node.left);
        System.out.print(node.value +" ");
        inorder(node.right);
    }

    //postorder traversal
    public void postorder(){
        postorder(root);
        System.out.println();
    }
    private void postorder( Node node){
        if(node==null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value +" ");
    }

    public List<List<Integer>> BFS(){
        List<List<Integer>> list= new ArrayList<>();
        if(root==null) return list;
        Queue<Node> que= new LinkedList<>();
        que.add(root);
        BFS(que,list);
        return list;
    }
    public void BFS(Queue<Node> que, List<List<Integer>> list){
        if(que.isEmpty()) return;
        Queue<Node> nque= new LinkedList<>();
        List<Integer> curr= new ArrayList<>();
        while(!que.isEmpty()){
            Node temp=que.remove();
            curr.add(temp.value);
            if(temp.left!=null) nque.add(temp.left);
            if(temp.right!=null) nque.add(temp.right);
        }
        list.add(curr);
        BFS(nque, list);
    }
}
