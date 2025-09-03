package Trees.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        BinaryTree bt= new BinaryTree();
//        Scanner sc= new Scanner(System.in);
//        bt.populate(sc);
//        bt.display();

        BST tree1= new BST();
        BST tree2= new BST();
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        tree1.populate(nums);
        tree1.display();
        System.out.println(tree1.balanced());

        tree2.populateSortedArray(nums);
        tree2.display();
        System.out.println(tree2.balanced());

    }
}
