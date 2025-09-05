package Trees.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        BinaryTree bt= new BinaryTree();
//        Scanner sc= new Scanner(System.in);
//        bt.populate(sc);
//        bt.display();

//        BST tree1= new BST();
//        BST tree2= new BST();
//        int[] nums={1,2,3,4,5,6,7,8,9,10};
//        tree1.populate(nums);
//        tree1.display();
//        System.out.println(tree1.balanced());
//
//        tree2.populateSortedArray(nums);
//        tree2.display();
//        System.out.println(tree2.balanced());

//        AVL tree = new AVL();
//        int[] nums={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
//        tree.populate(nums);
//        System.out.println(tree.balanced());
//        tree.display();

//        for (int i = 1; i < 1000; i++) {
//            tree.insert(i);
//        }
//        System.out.println(tree.balanced());
//        tree.display();

        int[] arr={3,8,7,6,-2,-8,4,9};
        SegmentTree tree= new SegmentTree(arr);
        System.out.println(tree.query(1,6));
    }
}
