package dsapractice.linkedlist;

public class LC83_RemoveDuplicatefromLinkedList {
	
	/*
	 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. 
	 * Return the linked list sorted as well.
	 *
     *Input - List of Node
     *Output - List of Node
     *
     *2. Test data set 
     * Test Data 1
     * Input : head = [1,1,2]
     * Output : [1,2]
     * 
     * Test Data 2
     * Input : head = [1,1,2,3,3]
     * Output : [1,2,3]
     * 
     * 5.Pseudo code 
     * -> Assign current node as head
     * ->Iterate using while loop until current and current.nxt is not null
     *   ->if current val is equal to current.nxt value and current .nxt is nxt.nxt
     *  ->else current = current.nxt
     * ->return head
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
		
		 public ListNode deleteDuplicates(ListNode head) {
			 ListNode current = head;
		        while (current != null && current.next != null) {
		            if (current.val == current.next.val) {
		                current.next = current.next.next; 
		            } else {
		                current = current.next; 
		            }
		        }
		        return head;
		 }
	}

}
