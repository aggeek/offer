package offer30;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;


/**
 * ����n���������ҳ�������С��K������
 * ��������4,5,1,6,2,7,3,8��8�����֣�
 * ����С��4��������1,2,3,4,��
 * @author admin
 *
 */
public class Solution {
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res=new ArrayList<>();
        int length=input.length;
        if(input.length==0||k>input.length||k==0) return res;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k,new Comparator<Integer>(){

			

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
        	
        });

        for(int i=0;i<length;i++){
            if(maxHeap.size()!=k){
                maxHeap.offer(input[i]);
            }else if(maxHeap.peek()>input[i]){
                maxHeap.poll();
                maxHeap.offer(input[i]);
            }
        }

        for(Integer i:maxHeap){
            res.add(i);
        }
        return res;
    }
}
