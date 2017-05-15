package offer38;
/**
 * 统计一个数字在排序数组中出现的次数。
 * @author admin
 *
 */
public class Solution {
	 public int GetNumberOfK(int [] array , int k) {
		 if(array.length==0) return 0;
	       int index1=Getfirst(array,k);
	       int index2=Getlast(array,k);
	       if(index1==-1||index2==-1) return 0;
	        return index2-index1+1;
	    }

	private int Getfirst(int[] array, int k) {
		int start=0;
		int end=array.length-1;
		int mid;
		while(start<=end){
			mid=start+(end-start)/2;
			if(k<array[mid])
                end=mid-1;
			 else if(k>array[mid])
	                start=mid+1;
	            else{
	            	if((mid>0&&array[mid-1]!=k)||mid==0)
	                    return mid;
	            	else{
	                    end=mid-1;
	                }
	            }
		}
		return -1;
		
	}
	 public static int Getlast(int[] array,int k){

	        int start=0;
	        int end=array.length-1;
	        int mid;
	        while(start<=end){
				mid=start+(end-start)/2;
				if(k<array[mid])
	                end=mid-1;
				 else if(k>array[mid])
		                start=mid+1;
		            else{
		            	if((mid<array.length-1&&array[mid+1]!=k)||mid==array.length-1)
		                    return mid;
		            	else{
		                    start=mid+1;
		                }
		            }
			}
			return -1;
			
		}
}