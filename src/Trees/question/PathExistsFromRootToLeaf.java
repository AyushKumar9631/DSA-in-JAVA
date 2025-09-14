package Trees.question;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class PathExistsFromRootToLeaf {
    public boolean hasPath(TreeNode root, int[] arr){
        if(root==null) return arr.length==0;
        return fxn(root, arr,0);
    }

    public boolean fxn(TreeNode node, int[] arr, int curr){
        if(node==null) return false;
        if(curr>=arr.length || node.val!=arr[curr]) return false;
        if(node.left==null && node.right==null && curr==arr.length-1) return true;
        return fxn(node.left,arr,curr+1) || fxn(node.right, arr, curr+1);
    }

    //count number of paths whose sum is equal to given sum
    public int countpaths(TreeNode root, int sum){
        List<Integer> path= new LinkedList<>();
        return helper(root, sum, path);
    }
    public int helper(TreeNode node, int sum, List<Integer> path){
        if(node==null) return 0;
        path.add(node.val);
        int count=0;
        int s=0;

        ListIterator<Integer> itr= path.listIterator();
        while(itr.hasPrevious()){
            s+=itr.previous();
            if(s==sum) count++;
        }
        count+=helper(node.left,sum,path) + helper(node.right,sum,path);

        path.remove(path.size()-1);
        return count;
    }

    //now provide all paths from root to leaf
    public List<List<Integer>> givepaths(TreeNode root, int sum){
        List<List<Integer>> paths= new ArrayList<>();
        List<Integer> path= new LinkedList<>();
        helper(root, sum, path, paths);
        return paths;
    }
    public void helper(TreeNode node, int sum, List<Integer> path, List<List<Integer>> paths){
        if(node==null) return;
        path.add(node.val);

        if(node.val==sum && node.left==null && node.right==null) paths.add(new ArrayList<>(path));
        else{
            helper(node.left,sum-node.val, path,paths);
            helper(node.right,sum-node.val, path,paths);
        }

        path.remove(path.size()-1);
    }
}
