package dsapractice.linkedlist;

import java.util.ArrayList;
import java.util.Collections;

public class LC147_InsertionSortList {
	/*
	 * Given the head of a singly linked list, sort the list using insertion sort, and return the sorted list's head.
     *The steps of the insertion sort algorithm:
     *Insertion sort iterates, consuming one input element each repetition and growing a sorted output list.
     *At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list and inserts it there.
     *It repeats until no input elements remain.
     *The following is a graphical example of the insertion sort algorithm. 
     *The partially sorted list (black) initially contains only the first element in the list. 
     *One element (red) is removed from the input data and inserted in-place into the sorted list with each iteration.
     *
     *
     *
     *Input - List of Node
     *Output - List of Node
     *
     *2. Test data set
     * Test Data 1
     * Input : head = [4,2,1,3]
     * Output : [1,2,3,4]
     * 
     * Test Data 2
     * Input : head = [-1,5,3,4,0]
     * Output : [-1,0,3,4,5]
     * 
     * Pseudo code 
     * ->Create an empty ArrayList called arr.
     * ->Initialize a new node called newnode with the head of the linked list.
     * ->While newnode is not null, do the following:
     *   ->Add the value of newnode to the ArrayList arr.
     *    -> Move newnode to the next node in the linked list.
     * ->Sort the ArrayList arr in ascending order.
     * ->Initialize a variable k to 0.
     *->Reset newnode to the head of the linked list.
     *->While newnode is not null, do the following:
     *    ->Set the value of newnode to the value at index k in the sorted ArrayList arr.
     *    ->Increment k.
     *    ->Move newnode to the next node in the linked list.
     *->Return the head of the sorted linked list.
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
	
	public ListNode insertionSortList(ListNode head) {
	      ArrayList<Integer> arr = new ArrayList<Integer>();
	        
	        ListNode newnode = head;
	        while(newnode!=null){
	            arr.add(newnode.val);
	            newnode=newnode.next;
	        }
	        Collections.sort(arr);
	        
	        int k=0;
	        newnode = head;
	        while(newnode!=null){
	            newnode.val = arr.get(k);
	            k++;
	            newnode=newnode.next;
	        }
	        return head;  
	    }

}
