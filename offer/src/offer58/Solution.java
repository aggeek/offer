package offer58;
/**
 * ������58������������һ���ڵ�
����һ�������������е�һ����㣬
���ҳ��������˳�����һ����㲢�ҷ��ء�
ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ�롣
 * @author admin
 *
 */
public class Solution {
	public TreeLinkNode GetNext(TreeLinkNode node)
    {
		if(node.right!=null){
			node=node.right;
			while(node.left!=null){
				node=node.left;
			}
			return node;
		}
		while(node.next!=null){
			if(node.next.left==node) return node.next;
			node=node.next;
		}
		return node;
		
    }
}
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}