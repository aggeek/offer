package offer50;
//面试题50：最低公共祖先：
public class Solution {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {
		if(root==null||A==root||B==root){
			return root;
		}
		 TreeNode left=lowestCommonAncestor(root.left,A,B);
	        TreeNode right=lowestCommonAncestor(root.right,A,B);
	        if(left!=null&&right!=null){
	        	return root;
	        }
	        if(left==null){
	        	return right;
	        }
	        if(right==null){
	        	return left;
	        }
	        return null;
	}
}
class TreeNode {
	  public int val;
      public TreeNode left, right;
      public TreeNode(int val) {
         this.val = val;
          this.left = this.right = null;
	      }
	  }