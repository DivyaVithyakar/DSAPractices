package dsapractice.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class LC208_RemoveLinkedListElements {
	
	/*
	 * Given the head of a linked list and an integer val, 
	 * remove all the nodes of the linked list that has Node.val == val, and return the new head.
	 *
     *
     *Input - list of integer , int
     *Output - list of integer
     *
     *2. Test data set 
     * Test Data 1
     * Input : head = [1,2,6,3,4,5,6], val = 6
     * Output : [1,2,3,4,5]
     * 
     * Test Data 2
     * Input : head = [], val = 1
     * Output : []
     * 
     * Test Data 3
     * Input : head = [7,7,7,7], val = 7
     * Output : []
     * 
     * 5.Pseudo code - 20 MINS
     * ->initialize one empty node 
     *->create variable for output and track to moving nodes
     * ->iterate using while loop until current node is null
     *   ->If my current value is != my target value
     *   ->store value to the dynamic node
     *   ->current dynamic value = current dynamic value.next
     *  ->return my output node
     *  
     * 
     * 
     * Time Complexity - 
     * Space Complexity -




	 */
	
	@Test
	public void test1() {
		 ListNode head = new ListNode(1,new ListNode(2,new ListNode(6,new ListNode(3,new ListNode(4, new ListNode(5, new ListNode(6, null)))))));
		ListNode removeElements = removeElements(head, 6);
		ListNode expected = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null)))));
		Assert.assertEquals(expected, removeElements);
		
	}
	
	
	class ListNode {
        private int val;
        private ListNode next;
        

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
	

    public ListNode removeElements(ListNode head, int val) {
        ListNode answer = new ListNode(0, null); 
        ListNode current = answer;
        ListNode temp = head;

        while (temp != null) {
            if (temp.val != val) {
            	current.next = new ListNode(temp.val, null);
            	current = current.next;
            }
            temp = temp.next;
        }

        return answer.next; 
    }
}