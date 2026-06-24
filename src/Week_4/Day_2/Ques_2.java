package Week_4.Day_2;
import java.util.*;
public class Ques_2 {
    class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;
        TreeNode(int val){
            this.val=val;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(q.size()>0){

            int size=q.size();
            List<Integer> ans=new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode curr=q.peek();
                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);

                ans.add(q.remove().val);
            }
            res.add(ans);
        }
        return res;
    }
}
