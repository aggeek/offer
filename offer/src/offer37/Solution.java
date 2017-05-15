package offer37;

import java.util.Stack;

//链表的共同节点无环
public class Solution {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		 Stack<ListNode> s1=new Stack<>();
		 Stack<ListNode> s2=new Stack<>();
		 if(pHead1!=null){
			 s1.push(pHead1);
			 pHead1=pHead1.next;
		 }
		 if(pHead2!=null){
			 s2.push(pHead2);
			 pHead2=pHead2.next;
		 }
		 ListNode same=null;
		 while(!s1.isEmpty()&&!s2.isEmpty()&&s1.peek()==s2.peek()){
			 s2.pop();same=s1.pop();
		 }
		return same; 
    }
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}