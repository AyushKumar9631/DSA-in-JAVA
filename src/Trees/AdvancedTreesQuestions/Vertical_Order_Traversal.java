package Trees.AdvancedTreesQuestions;

//leetcode question no.987
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Vertical_Order_Traversal {
    HashMap<Integer, List<List<Integer>>> map= new HashMap<>();
    int min=0;
    int max=0;

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result= new ArrayList<>();
        fxn(root,0,0);
        for(int i=min; i<=max; i++){
            List<List<Integer>> cur =map.get(i);
            cur.sort((a,b)-> (a.get(1)==b.get(1))? a.get(0)-b.get(0): a.get(1)-b.get(1));
            List<Integer> temp= new ArrayList<>();
            for(List<Integer> j: cur) temp.add(j.get(0));
            result.add(temp);
        }
        return result;
    }

    public void fxn(TreeNode node, int col, int row){
        if(node==null) return;
        min=Math.min(min,col);
        max=Math.max(max,col);
        if(map.containsKey(col)){
            List<Integer> temp= new ArrayList<>();
            temp.add(node.val);
            temp.add(row);
            map.get(col).add(temp);
        }
        else{
            List<List<Integer>> Temp= new ArrayList<>();
            List<Integer> temp= new ArrayList<>();
            temp.add(node.val);
            temp.add(row);
            Temp.add(temp);
            map.put(col, Temp);
        }
        fxn(node.left, col-1, row+1);
        fxn(node.right, col+1, row+1);
    }
}
