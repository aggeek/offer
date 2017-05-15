package offer61;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
//z×Ö´òÓ¡Ê÷
public class Solution {
	public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer> > res=new ArrayList<>();
		Queue<TreeNode> queue =new LinkedList<>();
		boolean flag=false;
		if(pRoot==null) return null;
		queue.offer(pRoot);
		while(!queue.isEmpty()){
			LinkedList<Integer> linkList=new LinkedList<>();
			int size=queue.size();
			for(int i=0;i<size;i++){
				TreeNode node=queue.poll();
			if(flag){
				linkList.addFirst(node.val);
			}else{
				linkList.addLast(node.val);
			}
			
			}
			res.add(new ArrayList<>(linkList));
			flag=!flag;
		}
		return res;
	}
} class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
