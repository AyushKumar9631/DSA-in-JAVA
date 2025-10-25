package Trees.AdvancedTreesQuestions;

public class TwoNodeSwap {

    TreeNode first;
    TreeNode second;
    TreeNode prev;

    public void fxn(TreeNode root){
        findNodes(root);

        //swap values
        int temp=first.val;
        first.val= second.val;
        second.val=temp;
    }

    private void findNodes(TreeNode node){
        if(node==null) return;
        findNodes(node.left);

        if(prev!=null && prev.val>node.val){
            if(first==null) first=prev;
            second=node;
        }
        prev= node;
        findNodes(node .right);
    }
}
