package offer09;
//ì³²¨ÄÇÆõÊý
public class Solution {
	 public int Fibonacci(int n) {
		 if(n==0) return 0;
		 if(n==1) return 1;
		 int fib0=0;
		 int fib1=1;
		 int fibn=0;
		 
		for(int i=2;i<=n;i++){
			 fibn=fib0+fib1;
			 fib0=fib1;
			 fib1=fibn;
			 
		 }
		return fibn;
	   }
}
