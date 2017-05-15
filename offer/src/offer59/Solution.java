package offer59;
/**
 * ������59���ԳƵĶ�����
��ʵ��һ�������������ж�һ�Ŷ������ǲ��ǶԳƵġ�
ע�⣬���һ��������ͬ�˶������ľ�����ͬ���ģ�������Ϊ�ԳƵġ�
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