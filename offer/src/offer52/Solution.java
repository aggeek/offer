package offer52;
/**
 * ����һ������A[0,1,...,n-1],�빹��һ������B[0,1,...,n-1],
 * ����B�е�Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]��
 * ����ʹ�ó�����
 * @author admin
 *
 */
import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        //����������
        int[] toward=new int[A.length];
        int[] forward=new int[A.length];
        //���������
        int[] B=new int[A.length];
        toward[0]=1;
        forward[0]=1;
        
        for(int i=1;i<A.length;i++){
            toward[i]=toward[i-1]*A[i-1];
            forward[i]=forward[i-1]*A[A.length-i];
        }
        
        for(int i=0;i<A.length;i++){
            B[i]=toward[i]*forward[A.length-i-1];
        }
        
        return B;
    }
}