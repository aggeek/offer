package offer62;

import java.util.LinkedList;
import java.util.Queue;

//序列化和反序列化树
//null也要保存，以防反序列化的时候产生歧义
public class Solution {
	String Serialize(TreeNode root) {
		StringBuilder sb=new StringBuilder();
		if(root==null){
			sb.append("#,");
			return sb.toString();
		}
		sb.append(root.val+",");
		sb.append( Serialize(root.left));
		sb.append(Serialize(root.right));
		return sb.toString();
	}
	TreeNode Deserialize(String str) {
		String[] value=str.split(",");
		Queue<String> queue=new LinkedList<>();
		for(int i=0;i<value.length;i++){
			queue.offer(value[i]);
		}
		return preOrder(queue);
	}
	private TreeNode preOrder(Queue<String> queue) {
		String value=queue.poll();
		if(value.equals("#")) return null;
		TreeNode head=new TreeNode(Integer.valueOf(value));
		head.left=preOrder(queue);
		head.right=preOrder(queue);
		
		return head
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				;
	}
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}