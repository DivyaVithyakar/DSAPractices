package dsapractice.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LC234_ParalindromeLinkedList {
	
	/*
	 * Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
	 */
	
	
	 public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	 
	 public boolean isPalindrome(ListNode head) {
	       List<Integer> list = new ArrayList();
	        while(head != null) {
	            list.add(head.val);
	            head = head.next;
	        }
	        
	        int left = 0;
	        int right = list.size()-1;
	        while(left < right && list.get(left) == list.get(right)) {
	            left++;
	            right--;
	        }
	        return left >= right;  
	    }

}
