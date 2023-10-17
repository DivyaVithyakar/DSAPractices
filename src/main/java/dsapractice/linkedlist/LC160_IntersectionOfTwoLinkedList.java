package dsapractice.linkedlist;



public class LC160_IntersectionOfTwoLinkedList {
	
	/*
	 * Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. 
	 * If the two linked lists have no intersection at all, return null.
     *For example, the following two linked lists begin to intersect at node c1:
     *The test cases are generated such that there are no cycles anywhere in the entire linked structure.
     *Note that the linked lists must retain their original structure after the function returns.
     *Custom Judge:
     *The inputs to the judge are given as follows (your program is not given these inputs):
     *intersectVal - The value of the node where the intersection occurs. This is 0 if there is no intersected node.
     *listA - The first linked list.
     *listB - The second linked list.
     *skipA - The number of nodes to skip ahead in listA (starting from the head) to get to the intersected node.
     *skipB - The number of nodes to skip ahead in listB (starting from the head) to get to the intersected node.
     *The judge will then create the linked structure based on these inputs and pass the two heads, headA and headB to your program. 
     *If you correctly return the intersected node, then your solution will be accepted.
     *
     *
     *
     *Input - List of Node, List of Node
     *Output - List of Node
     *
     *2. Test data set
     * Test Data 1
     * Input : intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
     * Output : 8
     * 
     * Test Data 2
     * Input : intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
     * Output : 2
     * 
     * Test Data 3
     * Input : intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
     * Output : No Intersection
     * 
     * 5.Pseudo code
     * ->Iterate using while loop until node1!=null
     * ->When node1 != null ->node 1= node1.nxt ->increnent i
     * ->Iterate using while loop until node1!=null
     *  ->node2=node2.nxt ->increment j
     * ->when i>j ->headA =headA.nxt->decrement i
     * ->when j>i ->headb-headb.nxt->decrement j
     * ->when headA!=Headb ->assign next variable for each respective nodes
     * ->return head
     * 
     * 
     * Time Complexity - 
     * Space Complexity -


	 */
	
	class ListNode {
		private int val;
		private ListNode next;

		public ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			int i = 1;
			int j = 1;
			ListNode node1 = headA;
			ListNode node2 = headB;
			while (node1 != null) {
				node1 = node1.next;
				i++;
			}
			while (node2 != null) {
				node2 = node2.next;
				j++;
			}
			while (i > j) {
				headA = headA.next;
				i--;

			}
			while (j > i) {
				headB = headB.next;
				j--;
			}
			while (headA != headB) {
				headA = headA.next;
				headB = headB.next;
			}
			return headB;
		}
	}

}
