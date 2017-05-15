package offer31;
/**
 * 例如:{6,-3,-2,7,-15,1,2,2},
 * 连续子向量的最大和为8(从第0个开始,到第3个为止)。
 * 你会不会被他忽悠住？(子向量的长度至少是1)
 * @author admin
 *动态规划
 */
public class Solution {
	 public int FindGreatestSumOfSubArray(int[] array) {
		 int len=array.length;
		 if(len==0) 
		return 0;
	     int dp[]=new int[len];
	     dp[0]=array[0];
	     int max=dp[0];
	     for(int i=1;i<len;i++){
	    	 dp[i]=array[i]+(dp[i-1]>0?dp[i-1]:0);
	    	 max=Math.max(max, dp[i]);
	    	 
	     }
	     return max;
	    }
}
