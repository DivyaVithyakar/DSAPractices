package dsapractice.linkedlist;

public class LC206_ReverseLinkedList {
	
	/*
	 * Given the head of a singly linked list, reverse the list, and return the reversed list.
	 */
	
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	
	
	public ListNode reverseList(ListNode head) {
        ListNode currNode = head;
       ListNode prev = null;
       while(currNode != null){
           ListNode nextNode = currNode.next;
           currNode.next = prev;
           prev = currNode;
           currNode = nextNode;
       }
       return prev; 
   }

}
