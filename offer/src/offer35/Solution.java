package offer35;

import java.util.HashMap;

/**
 * 在一个字符串(1<=字符串长度<=10000，全部由大写字母组成)
 * 中找到第一个只出现一次的字符,并返回它的位置
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
