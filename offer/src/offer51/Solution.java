package offer51;
//数组中重复的数
//方法一：用set  set的add方法添加成功会返回true；不详细说明
//方法二：因为数组长n数字范围0-n-1；如何不重复正好，因此将数放在应该存在的位置上，如何那个位置上有正确的数字就是重复
public class Solution {
	  public boolean duplicate(int numbers[],int length,int [] duplication) {
		  for(int i=0;i<length;i++){
			 
			if(numbers[i]!=numbers[numbers[i]]){
				int temp=numbers[i];
				numbers[i]=numbers[numbers[i]];
				numbers[numbers[i]]=temp;
			}else{
				duplication[0]=numbers[i];
				return true;
			}
		  }
	
		  
		return false;
	  }
}
