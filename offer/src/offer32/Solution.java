package offer32;
/**
 * ���1~13��������1���ֵĴ���,�����100~1300��������1���ֵĴ�����Ϊ�����ر�����һ��1~13�а���1��������1��10��11��12��13��˹�����6��,���Ƕ��ں�����������û���ˡ�
 * ACMerϣ�����ǰ����,
 * ������������ձ黯,
 * ���Ժܿ���������Ǹ�����������1���ֵĴ�����
 * @author admin
 *
 */
public class Solution {
	 public int NumberOf1Between1AndN_Solution(int n) {
		    int count=0;
		    for(int i=1;i<=n;i++){
		    	count+=numberCountOne(i);
		    }
		    return count;
	    }

	private int numberCountOne(int i) {
		int count=0;
		while(i!=0){
			if(i%10==1){
				count++;
				i/=10;
			}
		}
		return count;
	}
}



