package offer21;

import java.util.Stack;

//����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��СԪ�ص�min������
public class Solution {
	Stack<Integer> stack=new Stack<>();
	Stack<Integer> helpStack=new Stack<>();
	
	 public void push(int node) {
	        if(stack.isEmpty()){
	        	helpStack.push(node);
	        }
	        if(node<min()){
	        	helpStack.push(node);
	        }else{
	        	helpStack.push(min());
	        }
	        stack.push(node);
	    }
	    
	    public void pop() {
	        if(!stack.isEmpty()&&!helpStack.isEmpty()){
	        	int element=stack.pop();
	        	if(
	        			element==helpStack.peek()
	        			)
	        		helpStack.pop();
	        }
	    }
	    
	    public int top() {
	    	return stack.peek();
	        
	    }
	    
	    public int min() {
			return helpStack.peek();
	        
	    }
}
