package offer34;

import java.util.LinkedList;
import java.util.Queue;

//��ֻ��������2��3��5��������������Ugly Number��������6��8���ǳ�������14���ǣ���Ϊ����������7�� ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
public class Solution {
	 public int GetUglyNumber_Solution(int index) {
		 if(index==0)
	        return 0;
		 int n=1,ugly=1,min;
		 Queue<Integer> q2=new LinkedList<>();
		 Queue<Integer> q3=new LinkedList<>();
		 Queue<Integer> q5=new LinkedList<>();
		 q2.add(2);
		 q3.add(3);
		 q5.add(5);
		 while(n!=index){
			 ugly=Math.min(q2.peek(), Math.min(q3.peek(), q5.peek()));
			 if(ugly==q2.peek()){
				 q2.add(ugly*2);
				 q3.add(ugly*3);
				 q5.add(ugly*5);
				 q2.poll();
			 }
			 if(ugly==q3.peek()){
				
				 q3.add(ugly*3);
				 q5.add(ugly*5);
				 q3.poll();
			 }
			 if(ugly==q5.peek()){
				
				 q5.add(ugly*5);
				 q5.poll();
			 }
			 n++;
		 }
		 return ugly;
}
	 }