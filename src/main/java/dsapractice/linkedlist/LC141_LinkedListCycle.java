package dsapractice.linkedlist;



public class LC141_LinkedListCycle {
	
	/*
	 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
     *There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
     *Return true if there is a cycle in the linked list. Otherwise, return false.
     *
     *Pseudo Code
     *->Initialize two pointers.
     *->Iterate using while loop
     *  ->move one slow pointer fwd then slow = slow.next
     *  ->fast = fast.next.next
     * ->when the slow pointer will be pointing to the middle node of the linked list.
     *->Return the slow pointer
     * 
	 */
	
	class ListNode {
		private int val;
		private ListNode next;

		public ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;

		}
		 public boolean hasCycle(ListNode head) {
		        ListNode f=head;
		        ListNode s=head;
		        while(f!=null && f.next!=null){
		            s=s.next;
		            f=f.next.next;
		            if(s==f) return true;
		        }
		        return false;
		    }
	}

}
