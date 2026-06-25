package Week_4.Day_4;

public class Ques_2 {
    class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;
        TreeNode(int val){
            this.val=val;
        }
    }
    static int dia;
    public static int levels(TreeNode root){
        if(root==null ) return 0;
        int leftLevel=levels(root.left);
        int rightLevel=levels(root.right);
        int path=leftLevel+rightLevel;
        dia=Math.max(dia,path);
        return 1+Math.max(leftLevel,rightLevel);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        dia=0;
        levels(root);
        return dia;

    }
}
