package offer44;

import java.util.Arrays;

/*���˿����������5���ƣ��ж��ǲ���һ��˳�ӣ�����5�����ǲ��������ġ�2~10λ���ֱ���
AΪ1 JΪ11 QΪ12 KΪ13 ����С�����Կ������������*/
public class Solution {
	 public boolean isContinuous(int [] numbers) {
		 if(numbers==null||numbers.length<1){
	            return false;
	        }
	        //���� 0��ǰ��
	        Arrays.sort(numbers);
	        
	        int numberZero=0;
	        int numberGap=0;
//	      ͳ��0�ĸ���
	        for(int i=0;i<numbers.length;i++){
	        	if(numbers[i]==0){
	        		numberZero++;
	        	}
	        }
	        int small=numberZero;
	        int big=small+1;
	        while(big<numbers.length){
	        	if(numbers[small]==numbers[big]) return false;
	        	numberGap+=numbers[big]-numbers[small]-1;
	        	small=big;
	        	big++;
	        }
	        return numberGap<=numberZero? true:false;
	    }
}
