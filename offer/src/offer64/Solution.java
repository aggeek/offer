package offer64;

import java.util.Comparator;
import java.util.PriorityQueue;

//数据流中的中位数
public class Solution {
	private PriorityQueue<Integer> min=new PriorityQueue<>();
    private PriorityQueue<Integer> max=new PriorityQueue<>(11,new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o2-o1;
		}
	
    });
    private int count=0;
    public void Insert(Integer num) {
    if(count%2==0){
            max.offer(num);
            min.offer(max.poll());
        }else{
            min.offer(num);
            max.offer(min.poll());
        }
        count++;
    }

    public Double GetMedian() {
        if(count%2==0){
            return new Double((min.peek()+max.peek()))/2;
        }else{
            return new Double (min.peek());
        }
    }


}