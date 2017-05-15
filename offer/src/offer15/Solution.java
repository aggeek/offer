package offer15;
//输入一个链表，输出该链表中倒数第k个结点。
public class Solution {
	  public ListNode FindKthToTail(ListNode head,int k) {
		  if(k==0||head==null){
			  return null;
		  }
		  ListNode first=head;
		  ListNode behind=head;
		  for(int i=1;i<k;i++){
			  if(behind.next!=null)
			  behind=behind.next;
			  else
				  return null;
		  }
		  while(behind.next!=null){
			  first=first.next;
			  behind=behind.next;
		  }
		  
		return first;

	    }
}
class ListNode{
	int val;
	ListNode next;
	ListNode(int val){
		this.val=val;
	}
}