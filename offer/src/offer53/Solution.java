package offer53;
/**
 * ������53��������ʽ
��ʵ��һ����������ƥ�����'.'��'*'��������ʽ��ģʽ�е��ַ�'.'��ʾ����һ���ַ�����'*'��ʾ��ǰ����ַ����Գ�������Σ�����0�Σ��� �ڱ����У�ƥ����ָ�ַ����������ַ�ƥ������ģʽ��
���磬�ַ���"aaa"��ģʽ"a.a"��"ab*ac*a"ƥ�䣬������"aa.a"��"ab*a"����ƥ��
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
        //str�ݹ鵽��β��pattern�ݹ鵽��β���ɹ�
        if(str.length==strIndex&&pattern.length==patternIndex){
            return true;
        }
        //pattern�ݹ鵽��β������strû�е���β��ʧ��
        if(str.length!=strIndex&&pattern.length==patternIndex){
            return false;
        }
        //ģʽ���ڶ�����*
        if(patternIndex+1<pattern.length&&pattern[patternIndex+1]=='*'){
            //ģʽ�����������ַ�ƥ��orģʽ��"."�������ƥ���κ�
            if((str.length!=strIndex&&pattern[patternIndex]==str[strIndex])||(pattern[patternIndex]=='.'&&str.length!=strIndex)){
                return matchhelper(str,pattern,strIndex,patternIndex+2)||//aa ab*a b*ƥ��0��������b*��λ
                        matchhelper(str,pattern,strIndex+1,patternIndex+2)||//aba ab*a ֻƥ��1����
                        matchhelper(str,pattern,strIndex+1,patternIndex);//abba ab*a ��ƥ����
            }else {//ģʽ����������ƥ��Ļ�������������
                return matchhelper(str,pattern,strIndex,patternIndex+2);
            }
        }
        //û��*�ţ������ǰ�ַ��Ƚ���ͬ�Ļ�orģʽ����һ��"." ������ƥ�䣬������һ��
        if((str.length!=strIndex&&pattern[patternIndex]==str[strIndex])||(pattern[patternIndex]=='.'&&str.length!=strIndex)){
            return matchhelper(str,pattern,strIndex+1,patternIndex+1);
        }
        //��ƥ�� ����FALSE��
        return false;
    }

}