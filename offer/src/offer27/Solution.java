package offer27;

import java.util.ArrayList;
import java.util.List;

/**
 * ����һ�ö�����������
 * ���ö���������ת����һ�������˫������
 * Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
 * @author admin
 *
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Solution {
	 public TreeNode Convert(TreeNode pRootOfTree) {
	        if(pRootOfTree==null) return null;
	        List<TreeNode> list=new ArrayList<>();
	        inOrder(pRootOfTree,list);
	        int n=list.size();
	        for(int i=0;i<n;i++){
	        	if(i>0){
	        		list.get(i).left=list.get(i-1);
	        	}
	        	if(i<n-1){
	        		list.get(i).right=list.get(i+1);
	        	}
	        }
	        return list.get(0);
	    }

	private void inOrder(TreeNode root, List<TreeNode> list) {
		if(root==null) return ;
		inOrder(root.left, list);
		list.add(root);
		inOrder(root.right, list);
		
		
	}
}
