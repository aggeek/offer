package offer29;

import java.util.HashMap;
import java.util.Map;

/**
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡���������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
 * ��������2�������г�����5�Σ�
 * �������鳤�ȵ�һ�룬������2����������������0
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
