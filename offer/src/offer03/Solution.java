package offer03;

import java.util.Scanner;

/*������3����ά����Ĳ���
��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳�����������һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
*/
public class Solution {
	public boolean find(int target, int [][] array){
		if (array.length==0||array==null){
			return false;
		}
		//ȷ�����Ͻ�
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
		System.out.println("��������");
		
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					arr[i][j]=s.nextInt();
				}
			}
		
		Solution sol=new Solution();
		sol.find(target, arr);
	}
	
}
