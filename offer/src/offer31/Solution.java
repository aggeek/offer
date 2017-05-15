package offer31;
/**
 * ����:{6,-3,-2,7,-15,1,2,2},
 * ����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)��
 * ��᲻�ᱻ������ס��(�������ĳ���������1)
 * @author admin
 *��̬�滮
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
