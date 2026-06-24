package Week_4.Day_3;

public class Ques_1 {
    class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;
        TreeNode(int val){
            this.val=val;
        }
    }
    public TreeNode searchBST(TreeNode root, int val) {
        while(root!=null){
            if(root.val==val)return root;

            if(val<root.val){
                root=root.left;
            }else{
                root=root.right;
            }
        }
        return null;

    }
}
