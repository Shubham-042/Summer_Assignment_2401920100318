package Week_4.Day_4;

public class Ques_3 {
    class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;
        TreeNode(int val){
            this.val=val;
        }
    }
    static int maxSum;
    private int solve(TreeNode root){
        if(root==null) return 0;
        int l=solve(root.left);
        int r=solve(root.right);

        int neecheAnsMilgya=l+r+root.val;
        int koiEkAccha=Math.max(l,r)+root.val;
        int onlyRootAccha=root.val;

        maxSum=Math.max(maxSum,Math.max(neecheAnsMilgya,Math.max(koiEkAccha,onlyRootAccha)));
        return Math.max(onlyRootAccha,koiEkAccha);
    }
    public int maxPathSum(TreeNode root) {
        maxSum=Integer.MIN_VALUE;
        solve(root);
        return maxSum;
    }
}
