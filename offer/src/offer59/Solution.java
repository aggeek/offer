package offer59;
/**
 * 面试题59：对称的二叉树
请实现一个函数，用来判断一颗二叉树是不是对称的。
注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 * @author admin
 *
 */
public class Solution {
	boolean isSymmetrical(TreeNode root)
    {
		if(root==null) return false;
		return isSym(root.left,root.right);
		
    }

	private boolean isSym(TreeNode left, TreeNode right) {
		if(left==null&&right==null) return true;
		if(left==null||right==null) return false;
		if(left.val!=right.val)return false;
		return isSym(left.left, right.right)&&isSym(left.right, right.left);
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