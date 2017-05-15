package offer21;

import java.util.Stack;

//定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
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
