package offer18;
/*�������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
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
     //����B����ϣ���ȷ
     if(root2==null) return true;
     //����A����ϣ�����
     if(root1==null) return false;
     //ֵ��ͬ������
     if(root1.val!=root2.val)
         return false;
     //�ݹ��������
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