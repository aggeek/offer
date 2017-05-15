package offer05;


import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    	Stack<Integer> s=new Stack<>();
    	ArrayList<Integer> arrayList=new ArrayList<>();
    	while(listNode!=null){
    		s.push(listNode.value);
    		listNode=listNode.next;
    	}
		while(!s.isEmpty()){
			arrayList.add(s.pop());
		}
        return arrayList;
    }
}