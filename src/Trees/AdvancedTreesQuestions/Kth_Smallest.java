package Trees.AdvancedTreesQuestions;

//leetcode question no.230

public class Kth_Smallest {
    int counter=1;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return 0;
        return fxn(root,k);
    }

    public int fxn(TreeNode node, int k){
        if(node ==null) return -1;
        int left =fxn(node.left,k);
        if(left!=-1) return left;
        if(k==counter) return node.val;
        counter++;
        return fxn(node.right,k);
    }
}
