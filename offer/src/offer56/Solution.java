package offer56;
//面试题56：链表中环的入口节点
//一个链表中包含环，请找出该链表的环的入口结点。
public class Solution {
	public ListNode EntryNodeOfLoop(ListNode pHead){
		if(pHead==null||pHead.next==null) return null;
		ListNode slow=pHead.next;
		ListNode fast=pHead.next.next;
		while(slow!=fast){
			slow=slow.next;
			fast=fast.next.next;
			if(fast==null) return null;
		}
	
	while(slow!=pHead){
		slow=slow.next;
		pHead=pHead.next;
	}
	return slow;
}
}
class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}