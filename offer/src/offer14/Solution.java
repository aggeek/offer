package offer14;
/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的
 * 后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @author admin
 *思路两个指针
 */
public class Solution {
public void reOrderArray(int [] array) {
	if(array.length==1||array.length==0) return;
       int p1=0;
       int p2=0;
       int [] newArray=new int[array.length];
       for(int i=0;i<array.length;i++){
    	   if (((array[i])&0x1)==1){ p1++;}
    	   
       }
       for (int i=0;i<array.length;i++){
           if((array[i]&1)==1) newArray[p2++]=array[i];
           else newArray[p1++]=array[i];
       }
       for(int i=0;i<array.length;i++){
           array[i]=newArray[i];
       }
   }
}