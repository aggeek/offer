package offer28;

import java.util.*;
public class Solution {
    public ArrayList<String> Permutation(String str) {
       ArrayList<String> res=new ArrayList<>();
       if(str!=null&&str.length()>0){
           PermutationHelper(res,str.toCharArray(),0);
           Collections.sort(res);
       }
        return res;
    }
    
    public static void PermutationHelper(ArrayList<String> res,
                                         char[] str,
                                         int index){
        if(index==str.length-1){
            res.add(String.valueOf(str));
        }else{
            Set<Character> set=new HashSet<>();
            for(int i=index;i<str.length;i++){
                if(i==index||!set.contains(str[i])){
                    set.add(str[i]);
                    swap(str,index,i);
                    PermutationHelper(res,str,index+1);
                    swap(str,i,index);
                }
            }
        }
    }
    
    private static void swap(char[] cs,int i,int j){
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }
}
