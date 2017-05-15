package offer09;
/*我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
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