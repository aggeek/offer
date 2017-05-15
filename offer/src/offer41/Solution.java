package offer41;

import java.util.ArrayList;

//面试题41：
/*和为s的连续正数序列
输入一个正数s，打印出所有和为s的连续正数序列。
例如输入15  1+2+3+4+5=4+5+6=+7+8=15*/
public class Solution {
	 public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		 
		 ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		 if(sum<3) return list ;
		 int small=1;
		 int big=2;
		while(small!=(1+sum)/2){
			 int curSum=sumOfList(small, big);
			 if(curSum==sum) {
				ArrayList<Integer> temp=new ArrayList<>();
				for(int i=small;i<=big;i++){
					temp.add(i);
				}
				list.add(temp);
				small++;
				big++;
			 }else if(curSum<sum){
				 big++;
			 }else {
				 small++;
			 }
		}
		 return list;
	       
	    }

	private int sumOfList(int small, int big) {
		int sum=0;
		for(int i=small;i<=big;i++){
			sum+=i;
		}
		return sum;
	}
}
