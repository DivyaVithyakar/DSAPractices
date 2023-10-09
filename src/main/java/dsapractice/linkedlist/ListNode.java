package dsapractice.linkedlist;

import org.junit.Test;

public class ListNode {
	/*
	 * Given the head of a singly linked list, reverse the list, and return the reversed list.
	 * 
	 * PseudoCode
	 * -> create prev value as null
	 * ->current as head
	 * ->Next node is current.next
	 * ->Iterate using while loop until the current element is not null
	 *   ->current.next to point the previous element
	 *   ->previous points to current node
	 *   ->current node = next node
	 *  ->return my previous one
	 */
	
	
	 @Test
	 public void testReverseList() {
	       
	        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
	        System.out.println(head);
	        
	       
	        ListNode expected = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1, null)))));

	       
	        ListNode reversedList = head.reverseList(head);
	        System.out.println(reversedList);
//	        Assert.assertEquals(expected, reversedList);

	       
	      
	    }
	
	private  int value;
	private ListNode next;
	

	public ListNode(int value, ListNode next) {
		this.value = value;
		this.next = next;

	}
	
	
	public ListNode reverseList(ListNode head) {
		ListNode currentNode = head;
		ListNode prev = null;
		
		
		while (currentNode != null) {
			ListNode nextNode = currentNode.next;
			currentNode.next = prev;
			prev = currentNode;
			currentNode = nextNode;
		}
		return prev;
	}

}
