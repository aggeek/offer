package offer63;

import java.awt.List;
import java.util.ArrayList;

//二叉搜索树的第K个节点,中序遍历从小到大
public class Solution {
	 TreeNode KthNode(TreeNode pRoot, int k){
		 if(k<1||pRoot==null)  return null;
		 ArrayList<TreeNode> arr=new ArrayList<>();
		 inorder(pRoot,arr);
		 if(k>arr.size()) return null;
		 return arr.get(k-1);
		 
	 }

	private void inorder(TreeNode pRoot, ArrayList<TreeNode> arr) {

		if(pRoot==null) return ;
		if(pRoot!=null){
			inorder(pRoot.left,arr);
			
		}
		arr.add(pRoot);
		if(pRoot.right!=null){
			inorder(pRoot.right,arr);
		}
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