package offer16;



//输入一个链表，反转链表后，输出链表的所有元素。
//对于每个节点分析，保存指向的下一个元素，把指向下一个的指针指向前一个
public class Solution {
public ListNode reverse(ListNode head){
	ListNode pre=null;
	ListNode next =null;
	
	while (head!=null){
		next=head.next;
		
		head.next=pre;
		//向后推
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