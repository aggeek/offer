package offer09;
//青蛙跳台阶问题，一次可以调两级也可以跳一级，F（n）=f(n-1)+f(n-2)；类似斐波那契
public class Fog {
	public int jumpFloor(int n){
		if(n==0) return 0;
		if(n==1) return 1;
		if(n==2) return 2;
		
		int fib1=1;
		int fib2=2;
		int fibn=0;
		for(int i=3;i<=n;i++){
			fibn=fib1+fib2;
			fib1=fib2;
			fib2=fibn;
		}
		return fibn;
	}
}
