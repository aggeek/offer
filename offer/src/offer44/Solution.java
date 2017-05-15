package offer44;

import java.util.Arrays;

/*从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌是不是连续的。2~10位数字本身
A为1 J为11 Q为12 K为13 而大小王可以看成任意的数字*/
public class Solution {
	 public boolean isContinuous(int [] numbers) {
		 if(numbers==null||numbers.length<1){
	            return false;
	        }
	        //排序 0在前面
	        Arrays.sort(numbers);
	        
	        int numberZero=0;
	        int numberGap=0;
//	      统计0的个数
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
