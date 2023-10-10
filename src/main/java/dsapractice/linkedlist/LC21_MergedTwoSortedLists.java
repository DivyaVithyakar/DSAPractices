package dsapractice.linkedlist;

public class LC21_MergedTwoSortedLists {
	
	/*
	 * You are given the heads of two sorted linked lists list1 and list2.
     *Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
     *Return the head of the merged linked list.
     *
     *Input - List of Node, List of Node
     *Output - List Of Node
     *
     *2. Test data set 
     * Test Data 1
     * Input : list1 = [1,2,4], list2 = [1,3,4]
     * Output : [1,1,2,3,4,4]
     * 
     * Test Data 2
     * Input : list1 = [], list2 = []
     * Output : []
     * 
     * Test Data 3
     * Input : list1 = [], list2 = [0]
     * Output : [0]
     * 
     * 5.Pseudo code 
     * ->Initialize an empty node 
     *->Create two variables, one for the output and one to track the current nodes of the input lists.
     *->Iterate uning while loop that continues until both input lists
     *    ->Check if the current value in the first list is smaller than the current value in the second list.
     *    ->If same value create a new node with the current value from the first list. 
     *    ->Move the pointer of the first list to the next node.
     *    ->else create a new node with the current value from the second list.
     * ->Attach the new node to the result node, and move the result pointer to the newly added node.
     *Return the result
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

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode(-1);
		ListNode result = dummy;

		while (list1 != null && list2 != null) {
			

			if (list1.val > list2.val) {
				ListNode ls = new ListNode(list2.val);
				list2 = list2.next;
				result.next = ls;
				result = ls;
			} else {
				ListNode ls = new ListNode(list1.val);
				list1 = list1.next;
				result.next = ls;
				result = ls;
			}
		}

		while (list1 != null) {
			ListNode ls = new ListNode(list1.val);
			list1 = list1.next;
			result.next = ls;
			result = ls;
		}

		while (list2 != null) {

			ListNode ls = new ListNode(list2.val);
			list2 = list2.next;
			result.next = ls;
			result = ls;
		}

		return dummy.next;
	}

}
