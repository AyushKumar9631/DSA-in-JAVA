package Trees.question;

import Trees.implementation.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

//arrange the tree in BFS order and give the successor of given node in the formed order
public class LevelOrderSuccessor {
    public TreeNode fxn(TreeNode root, TreeNode key){
        //since we are not interested in level distinction. hence single queue is sufficient
        if(root==null) return null;
        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode temp=queue.poll();
            if(temp.left!=null) queue.add(temp.left);
            if(temp.right!=null) queue.add(temp.right);
            if(temp==key) break;
        }
        return queue.peek();
    }
}
