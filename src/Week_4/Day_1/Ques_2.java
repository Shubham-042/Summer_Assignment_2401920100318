package Week_4.Day_1;

public class Ques_2 {
    class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;
        TreeNode(int val){
            this.val=val;
        }
    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return null;
        TreeNode temp=invertTree(root.left);
        root.left=invertTree(root.right);
        root.right=temp;
        return root;
    }
}
