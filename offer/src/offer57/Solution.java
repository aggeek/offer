package offer57;

public class Solution {
	public ListNode deleteDuplication(ListNode head)
    {
		if(head==null) return null;
		ListNode pre=new ListNode(0);
		pre.next=head;
		head=pre;
		while(head.next!=null&&head.next.next!=null){
			if(head.next.val==head.next.next.val){
				int va=head.next.val;
				while(head.next!=null&&head.next.val==va){
					head.next=head.next.next;
				}
				
			}else head=head.next;
		}
		return pre.next;
    }
	
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}