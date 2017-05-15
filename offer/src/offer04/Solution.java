package offer04;

public class Solution {
	public String replaceSpace(StringBuffer str) {
		String array=str.toString();
		int blank=getBlank(array);
		int newLen=str.length()+2*blank;
		char[] res=new char[newLen];
		int arrayIndex=array.length()-1;
		int newIndex=res.length-1;
		while(arrayIndex>=0&&newIndex>=0){
			if (array.charAt(arrayIndex)==' ') {
				res[newIndex--]='0';
				res[newIndex--]='2';
				res[newIndex--]='%';
			} else {
				res[newIndex--]=array.charAt(arrayIndex);
			}
			arrayIndex--;
		}
		return new String(res);
		
	}

	private static int getBlank(String array) {
		int blank=0;
		for(int i=0;i<array.length();i++){
			if (array.charAt(i)==' ') {
				blank++;
			}
		}
		return blank;
	}
	
}
