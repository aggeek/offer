package offer09;
/*���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
*/
public class RectCover {
    public int RectCover(int target) {
        if(target==1) return 1;
        
        if(target==2) return 2;
        
        int fib0=1;
        int fib1=2;
        int fibn=0;
        for(int i=3;i<=target;i++){
            fibn=fib0+fib1;
            fib0=fib1;
            fib1=fibn;
        }
        return fibn;
    }
}