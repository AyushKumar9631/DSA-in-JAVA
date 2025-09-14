package Trees.question;

import java.util.Stack;

public class DFS_Using_stack {
    public void preorder(TreeNode node){
        if(node==null) return;
        Stack<TreeNode> stack= new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()){
            TreeNode temp=stack.pop();
            System.out.print(temp.val+" ");
            if(temp.right!=null) stack.push(temp.right);
            if(temp.left!=null) stack.push(temp.left);
        }
    }
}
