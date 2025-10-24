package Trees.AdvancedTreesQuestions;

//leetcode question no. 105
import java.util.HashMap;

public class Preorder_inorder {
    int[] preorder;
    int [] inorder;
    HashMap<Integer,Integer> indexes= new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        this.preorder=preorder;
        this.inorder=inorder;
        for(int i=0; i<n; i++){
            indexes.put(inorder[i], i);
        }
        return fxn(0,n-1, 0, n-1);
    }

    public TreeNode fxn(int sp, int ep, int si, int ei){
        if(sp>ep) return null;
        int val=preorder[sp];
        TreeNode node = new TreeNode(val);
        if(sp==ep) return node;
        int in=indexes.get(val);
        node.left=fxn(sp+1,sp+in-si, si, in-1);
        node.right=fxn(sp+in+1-si, ep, in+1, ei);
        return node;

    }
}
