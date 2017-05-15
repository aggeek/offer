package offer25;
import java.util.ArrayList;
import java.util.Stack;
/*输入一颗二叉树和一个整数，
 * 打印出二叉树中结点值的和为输入整数的所有路径
 * 。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
*/class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Solution {
	 ArrayList<ArrayList<Integer>> res=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
    	if(root==null) return res;
        Stack<Integer> s=new Stack<>();
        pathSum(s,root,target);
        return res;
    }
    public  void pathSum(
    		Stack<Integer> s,
                               TreeNode root,
                               int target){
        
         s.push(root.val);
        
        if(root.left==null&&root.right==null){
        	if(target==root.val) {
        		
        		res.add(new ArrayList<Integer>(s));
        	}
        }
        if(root.left!=null) pathSum(s,root.left,target-root.val);
        if(root.right!=null) pathSum(s,root.right,target-root.val);
        s.pop();
}
}

