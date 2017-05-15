package offer03;

import java.util.Scanner;

/*面试题3：二维数组的查找
在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
*/
public class Solution {
	public boolean find(int target, int [][] array){
		if (array.length==0||array==null){
			return false;
		}
		//确定右上角
		int row=0;
		int col=array[0].length-1;
		int cols=col;
		int rows=array.length-1;
		while(row<=rows&&row>=0&&col>=0&&col<=cols){
			if(target<array[row][col]){
				col--;
			}
			else if (target>array[row][col]) {
				row++;
			} else {
				
				return true;
			
			}
			
		}
		return false;
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int target=s.nextInt();
		int[][] arr=new int[4][4];
		System.out.println("输入数组");
		
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					arr[i][j]=s.nextInt();
				}
			}
		
		Solution sol=new Solution();
		sol.find(target, arr);
	}
	
}
