package dsapractice.linkedlist;

public class LC61_RotateList {
	/*
	 * Given the head of a linked list, rotate the list to the right by k places.
	 * 
	 * 1. Did I understand the problem? 
     *
     *Input - List of Node, int
     *Output - List of Node
     *
     *2. Test data set 
     * Test Data 1
     * Input : head = [1,2,3,4,5], k = 2
     * Output : [4,5,1,2,3]
     * 
     * Test Data 2
     * Input : head = [0,1,2], k = 4
     * Output : [2,0,1]
     * 
     * Test Data 3
     * Input :
     * Output :
     * 
     * 5.Pseudo code 
     * 
     * 
     * Time Complexity - 
     * Space Complexity -


	 */
	
	
	class ListNode {
		private int val;
		private ListNode next;

		public ListNode(int val) {
			this.val = val;
			this.next = next;
		}
		
		 public ListNode rotateRight(ListNode head, int k) {
	           if (head == null || head.next == null) return head;

	        ListNode curr = head;
	        int size = 0;

	        while (curr != null) {
	            size++;
	            curr = curr.next;
	        }

	        k %= size;
	        int count = 0;

	        while (count++ != k) {
	            curr = head;
	            while (curr.next.next != null) {
	                curr = curr.next;
	            }

	            ListNode end = curr.next;
	            curr.next = null;
	            end.next = head;
	            head = end;
	        }

	        return head;
	    }
	}

}
