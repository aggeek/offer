package offer14;
/**
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ��λ�������
 * ��벿�֣�����֤������������ż����ż��֮������λ�ò��䡣
 * @author admin
 *˼·����ָ��
 */
public class Solution {
public void reOrderArray(int [] array) {
	if(array.length==1||array.length==0) return;
       int p1=0;
       int p2=0;
       int [] newArray=new int[array.length];
       for(int i=0;i<array.length;i++){
    	   if (((array[i])&0x1)==1){ p1++;}
    	   
       }
       for (int i=0;i<array.length;i++){
           if((array[i]&1)==1) newArray[p2++]=array[i];
           else newArray[p1++]=array[i];
       }
       for(int i=0;i<array.length;i++){
           array[i]=newArray[i];
       }
   }
}