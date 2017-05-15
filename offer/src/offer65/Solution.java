package offer65;

import java.util.ArrayDeque;
import java.util.ArrayList;

//面试题65：滑动窗口的最大值
public class Solution {
	public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
		ArrayList<Integer> list = new ArrayList<Integer>();
        if(num.length==0||size>num.length||size==0){
            return list;
        }
        ArrayDeque<Integer> deque=new ArrayDeque<>();
        for(int i=0;i<num.length;i++){
            if(!deque.isEmpty()&&i-deque.peekFirst()==size){
                deque.pollFirst();
            }
            while(!deque.isEmpty()&&num[i]>=num[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offer(i);
            if(i>=(size-1)){
                list.add(num[deque.peekFirst()]);
            }
        }
        return list;
    }
}