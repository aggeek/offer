package offer51;
//�������ظ�����
//����һ����set  set��add������ӳɹ��᷵��true������ϸ˵��
//����������Ϊ���鳤n���ַ�Χ0-n-1����β��ظ����ã���˽�������Ӧ�ô��ڵ�λ���ϣ�����Ǹ�λ��������ȷ�����־����ظ�
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
