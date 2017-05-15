package offer40;

//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
  public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
	  if(array==null||array.length<2){
          return;
      }    
	  int resultbit=0;
	  for(int i=0;i<array.length;i++)
	  {
		  resultbit^=array[i];
	  }
	  int indexof=findFirstBitIs1(resultbit);
	  num2[0]=num1[0]=0;
	  for(int j=0;j<array.length;j++){
		  if(isBit1(array[j], indexof)){
			  num1[0]^=array[j];
		  } else {
			  num2[0]^=array[j];
		  }
	  }
	  
  }

private int findFirstBitIs1(int num) {
	 int indexBit=0;
     while(((num&1)==0)&&indexBit<32){
         num=num>>1;
         indexBit++;
     }
     return indexBit;
 }
public static boolean isBit1(int num,int indexBit){
    num=num>>indexBit;
    return (num&1)==0;
}
}