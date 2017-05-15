package offer29;

import java.util.HashMap;
import java.util.Map;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，
 * 超过数组长度的一半，因此输出2。如果不存在则输出0
 * @author admin
 *
 */
public class Solution {
public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer, Integer> map=new HashMap<>();
        boolean flag=true;
        if(array.length==0||array==null) {flag=false;return 0;}
        int res=0;
        
        for(int i=0;i<array.length;i++){
        	if(!map.containsKey(array[i])){
        		map.put(array[i], 1);
        	}else {
        		map.put(array[i], map.get(array[i])+1);
        	}
        	if(map.get(array[i])*2>array.length){
        		res=array[i];
        		break;
        	}else{
        		flag=false;
        		return 0;
        	}
        }
		return res;
        
    }
}
