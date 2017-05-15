package offer45;
//删除圆圈中第M个数，圆圈中剩下的数
public class Solution {
    public int LastRemaining_Solution(int n, int m) {
    	if(n<1||m<1) return -1;
    	int last=0;
    	for(int i=2;i<=n;i++){
    		last=(last+m)%i;
    	}
		return last;
        
    }
}