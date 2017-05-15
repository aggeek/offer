package offer42;
//reverse sentence
public class Solution {
	 public String ReverseSentence(String word) {
		 char[] s=word.toCharArray();
		 reverse(s,0,s.length-1);
		 int start=0;
		 int end=s.length-1;
		 for(int i=0;i<s.length;i++){
			 if(s[i]==' '){
				 reverse(s, start, i-1);
				 start=i+1;
			 }
		 }
		 reverse(s, start, end);
		return new String(s);
		 
	 }

	private void reverse(char[] s, int start, int end) {
		while(start<end)
		{
			char temp;
			temp=s[start];
			s[start]=s[end];
			s[end]=temp;
			start++;
			end--;
		}
	}
}
