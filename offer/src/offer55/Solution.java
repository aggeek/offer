package offer55;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * ��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ������磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ��
 * ��һ��ֻ����һ�ε��ַ���"g"�����Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
 * @author admin
 *˼·��linkedHashMap
 */
public class Solution {
	 //Insert one char from stringstream
	Map<Character, Integer> map=new LinkedHashMap<>();
    public void Insert(char ch)
    {
        if(map.containsKey(ch)){
        	map.put(ch, map.get(ch)+1);
        } else {
        	map.put(ch, 1);
        }
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
    	for (Map.Entry<Character, Integer> entry : map.entrySet()) {
    		if(entry.getValue()==1){
    			return entry.getKey();
    		}
			
		}
		return '#';
    
    }
}
