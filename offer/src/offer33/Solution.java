package offer33;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����
 * ������������{3��32��321}��
 * ���ӡ���������������ųɵ���С����Ϊ321323��
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
