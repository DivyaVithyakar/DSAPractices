package dsapractice.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LC1609_EvenOddTree {
	
	/*
	 * A binary tree is named Even-Odd if it meets the following conditions:
	 * The root of the binary tree is at level index 0, its children are at level index 1, their children are at level index 2, etc.
	 * For every even-indexed level, all nodes at the level have odd integer values in strictly increasing order (from left to right).
	 * For every odd-indexed level, all nodes at the level have even integer values in strictly decreasing order (from left to right).
	 * Given the root of a binary tree, return true if the binary tree is Even-Odd, otherwise return false.
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
	
	public boolean isEvenOddTree(TreeNode root) {
        if (root == null) {
          return true;
      }
      Queue<TreeNode> queue = new LinkedList<>();
      boolean flag = true;
      queue.offer(root);
      while (!queue.isEmpty()) {
          int size = queue.size();
          int prev = flag ? Integer.MIN_VALUE : Integer.MAX_VALUE;
          for (int i = 0; i < size; i++) {
              TreeNode node = queue.poll();
              if (flag) {
                  if (node.val % 2 == 0 || node.val <= prev) {
                      return false;
                  }
              } else {
                  if (node.val % 2 != 0 || node.val >= prev) {
                      return false;
                  }
              }
              if (node.left != null) {
                  queue.offer(node.left);
              }
              if (node.right != null) {
                  queue.offer(node.right);
              }
              prev = node.val;
          }
          flag = !flag;
      }
      return true;
  }

}
