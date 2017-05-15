package offer13;

public class Solution {
	public void delete(ListNode node){
		//转换成删除下一个点，将下一个点的值写在这个值上
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