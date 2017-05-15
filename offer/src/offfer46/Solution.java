package offfer46;
//1+2....+n问题不能使用运算符条件控制语句
public class Solution {
	 public int Sum_Solution(int n) {
	        int sum=n;
	        boolean flag=(n>0)&&(sum+= Sum_Solution(n-1))>0;
	        return  sum;
	    }
}
