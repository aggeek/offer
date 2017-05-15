package offer41;

import java.util.ArrayList;
/**
 * 输入一个递增排序的数组和一个数字S，
 * 在数组中查找两个数，是的他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。 
 * @author admin
 *
 */
public class Solution2 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
    	   ArrayList<Integer> list=new ArrayList<>();
           if(array==null||array.length<2){
               return list;
           }
           int lo=0;
           int hi=array.length-1;
           while(lo<hi){
        	   int cache= array[lo]+array[hi];
        	   if(cache==sum){
        		   list.add(array[lo]);
        		   list.add(array[hi]);
        		   break;
        	   }else if(cache<sum){
        		   lo++;
        	   }
        	   else{
        		   hi--;
        	   }
           }
		return list;
        
    }
}