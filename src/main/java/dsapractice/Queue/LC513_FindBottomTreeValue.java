package dsapractice.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LC513_FindBottomTreeValue {
	
	/*
	 * Given the root of a binary tree, return the leftmost value in the last row of the tree.


	 */
	
	public class TreeNode {
		      int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode() {}
		     TreeNode(int val) { this.val = val; }
		     TreeNode(int val, TreeNode left, TreeNode right) {
		         this.val = val;
		         this.left = left;
		         this.right = right;
		     }
		 }
	
	 public int findBottomLeftValue(TreeNode root) {
	      int last = 0;
	        Queue<TreeNode> q = new LinkedList<>();
	        q.add(root);

	        while (!q.isEmpty()) {
	            int count = q.size();
	            for (int i = 0; i < count; i++) {
	                TreeNode curr = q.poll();
	                if (i == 0)
	                    last = curr.val;  // last leftMost val
	                if (curr.left != null)
	                    q.add(curr.left);
	                if (curr.right != null)
	                    q.add(curr.right);
	            }
	        }
	        return last;   
	    }

}
