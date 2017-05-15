package offer49;
//面试题49：将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0 
public class Solution {
	 public int StrToInt(String str) {
	        int i=0;
	        str.trim();
	        char[] c=str.toCharArray();
	        int sign=1;
	        if (i < c.length && (c[i] == '-' || c[i] == '+')) {
	            if (c[i] == '-') {
	                sign = -1;
	            }
	            i++;
	        }
	        int num=0;
	        int bound=Integer.MAX_VALUE/10;
	        while(i<c.length){
	        	if(c[i]<'0'||c[i]>'9'){
	        		return 0;
	        	} 
	        		int digt=c[i]-'0';
	        		
	        	
	        	if(num>bound||num==bound&&digt>7){
	        		return sign==1? Integer.MAX_VALUE:Integer.MIN_VALUE;
	        	}
	        	num=num*10+digt;
	        	i++;
	        }
			return num*sign;
	    }
}
