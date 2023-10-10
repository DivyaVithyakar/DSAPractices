package dsapractice.linkedlist;

public class LC876_MiddleOfTheLinkedList {
	
	/*
	 * Given the head of a singly linked list, return the middle node of the linked list.
     *If there are two middle nodes, return the second middle node.
     *
     *1. Did I understand the problem? 
     *
     *Input - List of Node
     *Output - List of Node
     *
     *2. Test data set 
     * Test Data 1
     * Input : head = [1,2,3,4,5]
     * Output : [3,4,5]
     * 
     * Test Data 2
     * Input : head = [1,2,3,4,5,6]
     * Output : [4,5,6]
     * 
     * Test Data 3
     * Input :
     * Output :
     * 
     * 5.Pseudo code
     * ->Initialize two pointers.
     *->Iterate using while loop
     *  ->move one slow pointer fwd then slow = slow.next
     *  ->fast = fast.next.next
     * ->when the slow pointer will be pointing to the middle node of the linked list.
     *->Return the slow pointer
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

		public ListNode middleNode(ListNode head) {
			ListNode slow = head;
			ListNode fast = head;

			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow;
		}
	}

}
