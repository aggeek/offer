package offer39;
/**
 * ����һ�ö����������������ȡ�
 * �Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�
 * @author admin
 *
 */
public class Solution {
	public int TreeDepth(TreeNode pRoot)
    {
		if(pRoot==null) return 0;
    int left=TreeDepth(pRoot.left);
    int right=TreeDepth(pRoot.right);
    return Math.max(left,right)+1;
    }
}

