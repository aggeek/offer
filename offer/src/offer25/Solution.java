package offer25;
import java.util.ArrayList;
import java.util.Stack;
/*����һ�Ŷ�������һ��������
 * ��ӡ���������н��ֵ�ĺ�Ϊ��������������·��
 * ��·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
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

