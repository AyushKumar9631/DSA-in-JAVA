package Trees.AdvancedTreesQuestions;


public class BST_to_DLL {
    class DLLNode{
        int val;
        DLLNode prev;
        DLLNode next;
        public DLLNode(int val){
            this.val=val;
        }
    }

    DLLNode head;
    DLLNode tail;

    public DLLNode convet(TreeNode root){
        if(root==null) return null;
        fxn(root);
        return head;
    }
    private void fxn(TreeNode node){
        if(node==null) return;
        fxn(node.left);

        DLLNode cur= new DLLNode(node.val);
        if(head==null){
            head=cur;
            tail=cur;
        }
        else{
            tail.next=cur;
            cur.prev=tail;
            tail=cur;
        }

        fxn(node.right);
    }

}
