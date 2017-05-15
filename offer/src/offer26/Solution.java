package offer26;

import java.util.HashMap;
import java.util.Map;

//¸´ÔÓÁ´±íµÄ¸´ÖÆ
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
public class Solution {
	 public RandomListNode Clone(RandomListNode pHead)
	    {
		 if(pHead==null) 
			return null;
	 Map<RandomListNode,RandomListNode> clone=new HashMap<>();
	 RandomListNode node=pHead;
	 while(node!=null){
		 clone.put(node, new RandomListNode(node.label));
		 node=node.next;
	 }
	 node=pHead;
	 while(node!=null){
		 clone.get(node).next=clone.get(node.next);
		 clone.get(node).random=clone.get(node.random);
		 node=node.next;
	 }
	return clone.get(pHead);
}
}
