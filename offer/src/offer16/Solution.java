package offer16;



//����һ��������ת�����������������Ԫ�ء�
//����ÿ���ڵ����������ָ�����һ��Ԫ�أ���ָ����һ����ָ��ָ��ǰһ��
public class Solution {
public ListNode reverse(ListNode head){
	ListNode pre=null;
	ListNode next =null;
	
	while (head!=null){
		next=head.next;
		
		head.next=pre;
		//�����
		pre=head;
		head=next;
		
	}
	return pre;
}
}
class ListNode{
	int val;
	ListNode next;
	ListNode(int val){
		this.val=val;
	}
}