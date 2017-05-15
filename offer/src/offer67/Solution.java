package offer67;
//面试题67：机器人的运动范围
public class Solution {
	  public int movingCount(int threshold, int rows, int cols)
	    {
		  int flag[][]=new int[rows][cols];
	        return helper(0,0,rows,cols,flag,threshold);
	    }

	private int helper(int i, int j, int rows, int cols, int[][] flag, int threshold) {
		if(i<0||i>=rows||j<0||j>=cols||sum(i)+sum(j)>threshold||flag[i][j]==1){
            return 0;
        }
		  flag[i][j]=1;
		  return helper(i+1,j,rows,cols,flag,threshold)+
	                helper(i-1,j,rows,cols,flag,threshold)+
	                helper(i,j+1,rows,cols,flag,threshold)+
	                helper(i,j-1,rows,cols,flag,threshold)+1;
	}
	 public int sum(int num){
	        int sum=0;
	        do{
	            sum+=num%10;
	        }while(
	            (num=num/10)>0
	        );
	        return sum;
	    }
	}