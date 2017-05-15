package offer39;
//判断是不是平衡而叉树
public class Solution2 {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null) return true;
        
        int left=treeDepth(root.left);
        int right=treeDepth(root.right);
        
        if(left-right>1||left-right<-1){
            return false;
        }
        
        return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
    }
    public static int treeDepth(TreeNode root){
        if(root==null) return 0;
        
        return Math.max(treeDepth(root.left),treeDepth(root.right))+1;
    }
}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}