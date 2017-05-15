package offer24;

import java.util.Arrays;

/*输入一个整数数组，
 * 判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。
 * 假设输入的数组的任意两个数字都互不相同。
 * 
 * 
 * 二叉搜索树左边孩子小于根，右边的大于根
 * 后序前部分小于根 后部分大于根，将数组分成两部分，递归求解
*/
public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
    	int len=sequence.length;
    	if(sequence==null||len==0) return false;
    	int root=sequence[len-1];
    	int i=0;
    	for(;i<len-1;i++){
    		if(sequence[i]>root) {
    			break;
    		}
    		
    	}
    	int j=i;
    	for(;j<len-1;j++){
    		if(sequence[j]<root){
    			return false;
    		}
    	}
    	boolean left=true;
    	boolean right=true;
    	//递归遍历左子树
        if(i>0){
            left=VerifySquenceOfBST(Arrays.copyOfRange(sequence,0,i));
             
        }
        //递归遍历右子树
        if(i<len-1){
            right=VerifySquenceOfBST(Arrays.copyOfRange(sequence,i,len-1));
        }
         
        return left&&right;
    }
}