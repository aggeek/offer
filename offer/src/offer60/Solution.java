package offer60;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		Queue<TreeNode> queue=new LinkedList<>();
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
		if(pRoot==null) return null;
		queue.offer(pRoot);
		
		while(!queue.isEmpty()){
			 int level=queue.size();
             ArrayList<Integer> cache=new ArrayList<>();
             for(int i=0;i<level;i++){
            	 TreeNode node=queue.poll();
            	 cache.add(node.val);
            	 if(node.left!=null) queue.offer(node.left);
            	 if(node.right!=null) queue.offer(node.right);
            	 
             }
             res.add(cache);
		}
		return res;
	}
}
class TreeNode{
	int val=0;
	TreeNode left=null;
	TreeNode right=null;
	TreeNode(int val){
		this.val=val;
	}
}