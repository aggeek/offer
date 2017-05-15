package offer52;
/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * 不能使用除法。
 * @author admin
 *
 */
import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        //开两个数组
        int[] toward=new int[A.length];
        int[] forward=new int[A.length];
        //开结果数组
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