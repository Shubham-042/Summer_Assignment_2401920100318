package Week_4.Day_2;
import java.util.*;
public class Ques_1 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    void dfs(TreeNode root,List<Integer> res){
        if(root==null)return;
        dfs(root.left,res);
        res.add(root.val);
        dfs(root.right,res);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        dfs(root,res);
        return res;
    }
}
