package offer49;
//������49����һ���ַ���ת����һ��������Ҫ����ʹ���ַ���ת�������Ŀ⺯���� ��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0 
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
