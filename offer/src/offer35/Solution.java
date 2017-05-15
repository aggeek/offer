package offer35;

import java.util.HashMap;

/**
 * ��һ���ַ���(1<=�ַ�������<=10000��ȫ���ɴ�д��ĸ���)
 * ���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��
 * @author admin
 *
 */
public class Solution {
	 public int FirstNotRepeatingChar(String str) {
		 HashMap<Character, Integer> hashMap=new HashMap<>(256);
		 char[] arr=str.toCharArray();
		 for(int i=0;i<arr.length;i++){
			 if(!hashMap.containsKey(arr[i])){
				 hashMap.put(arr[i], 1);
			 }else{
				 hashMap.put(arr[i], hashMap.get(arr[i])+1);
			 }
		 }
		 for(int i=0;i<arr.length;i++){
			 if(hashMap.get(arr[i])==1){
				 return i;
				 
			 }
		 }
		 return -1;
	    }
}
