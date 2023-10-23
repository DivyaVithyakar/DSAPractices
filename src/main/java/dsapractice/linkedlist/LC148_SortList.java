package dsapractice.linkedlist;



public class LC148_SortList {
	/*
	 * Given the head of a linked list, return the list after sorting it in ascending order.
	 *
     *
     *Input - List of Node
     *Output - List of Node
     *
     * Test data set 
     * Test Data 1
     * Input : head = [4,2,1,3]
     * Output : [1,2,3,4]
     * 
     * Test Data 2
     * Input : head = [-1,5,3,4,0]
     * Output : [-1,0,3,4,5]
     * 
     * Test Data 3
     * Input : head = []
     * Output : []
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
	}

	public ListNode sortList(ListNode head) {
		// ListNode A=head;
		return mergeSort(head);
	}

	public ListNode mergeSort(ListNode A) {
		if (A == null)
			return null;
		if (A.next == null)
			return A;
		ListNode mid = findMiddle(A);
		ListNode rightStart = mid.next;
		mid.next = null;
		ListNode leftSorted = mergeSort(A);
		ListNode rightSorted = mergeSort(rightStart);
		ListNode sorted = merge(leftSorted, rightSorted);
		return sorted;
	}

	public ListNode findMiddle(ListNode head) {
		ListNode slow = head;
		ListNode fast = slow.next;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

	public ListNode merge(ListNode A, ListNode B) {
		if (A == null)
			return B;
		if (B == null)
			return A;
		ListNode head = new ListNode(0);
		ListNode temp = head;
		while (A != null && B != null) {
			if (A.val <= B.val) {
				temp.next = A;
				A = A.next;
			} else {
				temp.next = B;
				B = B.next;
			}
			temp = temp.next;
		}
		while (A != null) {
			temp.next = A;
			A = A.next;
			temp = temp.next;
		}
		while (B != null) {
			temp.next = B;
			B = B.next;
			temp = temp.next;
		}
		return head.next;
	}

}
