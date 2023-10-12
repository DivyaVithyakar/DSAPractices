package dsapractice.linkedlist;

public class LC1290_ConvertBinaryNumbertoLinkedListInteger {
	/*
	 * Given head which is a reference node to a singly-linked list. 
	 * The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
     *Return the decimal value of the number in the linked list.
     *The most significant bit is at the head of the linked list.
     *
     *
     *Input - List of Node
     *Output - int
     *
     *2. Test data set
     * Test Data 1
     * Input : head = [1,0,1]
     * Output : 5
     * 
     * Test Data 2
     * Input : head = [0]
     * Output : 0
     * 
     * 
     * 5.Pseudo code 
     * ->Initialize one variable to store the result
     * ->Iterate using while loop until the current element is not null
     *   ->tempvalue and 2*result add to get result ->temp is temp.nxt
     * ->return result
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
		
		 public int getDecimalValue(ListNode head) {
	         int result=0;
	        ListNode temp=head;
	        while(temp!=null)
	        {
	            result= (result*2) + temp.val;
	            temp=temp.next;
	        }
	        return result;
	    }
	}

}
