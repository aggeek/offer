package offer13;

public class Solution {
	public void delete(ListNode node){
		//ת����ɾ����һ���㣬����һ�����ֵд�����ֵ��
		node.val=node.next.val;
		node.next=node.next.next;
	}
}
class ListNode{
	int val;
	ListNode next;
	ListNode(int val){
		this.val=val;
	}
	
}