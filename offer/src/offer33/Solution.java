package offer33;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，
 * 则打印出这三个数字能排成的最小数字为321323。
 * @author admin
 *
 */
public class Solution {
	 public String PrintMinNumber(int [] numbers) {
		 if(numbers.length==0||numbers==null) return null;
		 String[] num=new String[numbers.length];
		 for(int i=0;i<numbers.length;i++){
			 num[i]=String.valueOf(numbers[i]);
		 }
		 Arrays.sort(num, 0,num.length,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return (o1+o2).compareTo(o2+o1);
			}
			 
		});
		 StringBuilder sb=new StringBuilder();
		 for (String string : num) {
			 sb.append(string);
			
		}
		return sb.toString();
	    }
}
