package offer11;
//����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
public class Solution {
	  public double Power(double base, int exponent) {
		  if(exponent==0) return 1;
		  if(Math.abs(base-0.0)<0.0000001) return 0.0;
		    if(Math.abs(base-1.0)<0.0000001) return 1.0;
		    if(exponent<0) base=1/base;
		    
		    return Power1(base,Math.abs(exponent));
		    
	
	        
	  }

	private double Power1(double base, int n) {
		if(n==0) return 1;
		if(n==1) return base;
		return (n&0x1)==1? base*Power1(base*base,n/2):Power1(base*base,n/2) ;
	}
}
