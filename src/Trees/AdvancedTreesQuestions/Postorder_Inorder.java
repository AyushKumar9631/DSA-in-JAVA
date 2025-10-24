package Trees.AdvancedTreesQuestions;

//leetcode question no 106
import java.util.HashMap;

public class Postorder_Inorder {
    int[] postorder;
    int[] inorder;
    HashMap<Integer, Integer> indexes= new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=inorder.length;
        this.postorder=postorder;
        this.inorder=inorder;
        for(int i=0; i<n; i++){
            indexes.put(inorder[i], i);
        }
        return fxn(0,n-1,0,n-1);
    }

    public TreeNode fxn(int si, int sj, int pi, int pj){
        if(pi>pj) return null;
        int val=postorder[pj];
        TreeNode node= new TreeNode(val);
        if(pi==pj) return node;
        int ri=indexes.get(val);
        int count=ri-si;
        node.left=fxn(si,ri-1, pi , pi+count-1);
        node.right=fxn(ri+1, sj, pi+count, pj-1);
        return node;
    }
}
