package offer08;
import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
    	if (array.length==0) {
    		return 0;
    	}
    	int mid=0;
    	int hi=array.length-1;
    	int lo=0;
    	while(lo<hi){
    		mid=lo+(hi-lo)/2;
    		if(array[mid]>array[hi]) {
    			lo=mid+1;
    		} else if(array[mid]<array[hi]){
    			hi=mid;
    		} else {
    			hi--;
    		}
    	}
    return array[lo];
    }
}
