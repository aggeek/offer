package offer41;

import java.util.ArrayList;
/**
 * ����һ����������������һ������S��
 * �������в������������ǵ����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ� 
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