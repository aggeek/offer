package offer18;
/*输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
*/
public class Solution {
 public boolean HasSubtree(TreeNode root1,TreeNode root2) {
	boolean result=false;
	
	if(root1!=null&&root2!=null){
		if(root1.val==root2.val) return does(root1,root2);
		if(result=false) result=HasSubtree(root1.left,root2);
		 if(result==false)
             result=HasSubtree(root1.left,root2);
	}
	return result;
}
 public boolean does(TreeNode root1,TreeNode root2){
     //遍历B树完毕，正确
     if(root2==null) return true;
     //遍历A树完毕，错误
     if(root1==null) return false;
     //值不同，错误
     if(root1.val!=root2.val)
         return false;
     //递归继续遍历
     return does(root1.left,root2.left)&&does(root1.right,root2.right);
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