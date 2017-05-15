package offer53;
/**
 * 面试题53：正则表达式
请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。 在本题中，匹配是指字符串的所有字符匹配整个模式。
例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 * @author admin
 *
 */
public class Solution {
    public boolean match(char[] str, char[] pattern)
    {
        if(str==null||pattern==null) return false;
        int strIndex=0;
        int patternIndex=0;
        return matchhelper(str,pattern,strIndex,patternIndex);
        
    }
       public boolean matchhelper(char[] str, char[] pattern, int strIndex, int patternIndex) {
        //str递归到结尾，pattern递归到结尾。成功
        if(str.length==strIndex&&pattern.length==patternIndex){
            return true;
        }
        //pattern递归到结尾，但是str没有到结尾，失败
        if(str.length!=strIndex&&pattern.length==patternIndex){
            return false;
        }
        //模式串第二个是*
        if(patternIndex+1<pattern.length&&pattern[patternIndex+1]=='*'){
            //模式串和主串的字符匹配or模式串"."代表可以匹配任何
            if((str.length!=strIndex&&pattern[patternIndex]==str[strIndex])||(pattern[patternIndex]=='.'&&str.length!=strIndex)){
                return matchhelper(str,pattern,strIndex,patternIndex+2)||//aa ab*a b*匹配0个。跳过b*两位
                        matchhelper(str,pattern,strIndex+1,patternIndex+2)||//aba ab*a 只匹配1个。
                        matchhelper(str,pattern,strIndex+1,patternIndex);//abba ab*a 可匹配多个
            }else {//模式串和主串不匹配的话，往后走两步
                return matchhelper(str,pattern,strIndex,patternIndex+2);
            }
        }
        //没有*号，如果当前字符比较相同的话or模式串有一个"." 都可以匹配，往后走一步
        if((str.length!=strIndex&&pattern[patternIndex]==str[strIndex])||(pattern[patternIndex]=='.'&&str.length!=strIndex)){
            return matchhelper(str,pattern,strIndex+1,patternIndex+1);
        }
        //不匹配 返回FALSE；
        return false;
    }

}