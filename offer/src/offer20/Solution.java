package offer20;

import java.util.ArrayList;
/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @author admin
 *
 */
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
    	 ArrayList<Integer> res=new ArrayList<>();
		if(matrix.length==0){
			return res;
		}
		int rowBegin=0;
		int rowEnd=matrix.length-1;
		int colBegin=0;
		int colEnd=matrix[0].length-1;
		while(rowBegin<=rowEnd&&colBegin<=colEnd){
			 for(int i=colBegin;i<=colEnd;i++){
	                res.add(matrix[rowBegin][i]);
	            }
	            rowBegin++;
			for (int i=rowBegin;i<=rowEnd;i++){
				res.add(matrix[i][colEnd]);
			}
			colEnd--;
			if(rowBegin>rowEnd||colBegin>colEnd) break;
			for (int i=colEnd;i>=colBegin;i--){
				res.add(matrix[rowEnd][i]);
			}
			rowEnd--;
			for (int i=rowEnd;i>=rowBegin;i--){
				res.add(matrix[i][colBegin]);
			}
			colBegin++;
		}
		return res;
       
    }
}