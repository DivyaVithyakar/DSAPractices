package dsapractice.Queue;

import java.util.Deque;
import java.util.LinkedList;

public class LC641_DesignCircularDequeue {
	
	/*
	 * Design your implementation of the circular double-ended queue (deque).
     *Implement the MyCircularDeque class:
     *MyCircularDeque(int k) Initializes the deque with a maximum size of k.
     *boolean insertFront() Adds an item at the front of Deque. Returns true if the operation is successful, or false otherwise.
     *boolean insertLast() Adds an item at the rear of Deque. Returns true if the operation is successful, or false otherwise.
     *boolean deleteFront() Deletes an item from the front of Deque. Returns true if the operation is successful, or false otherwise.
     *boolean deleteLast() Deletes an item from the rear of Deque. Returns true if the operation is successful, or false otherwise.
     *int getFront() Returns the front item from the Deque. Returns -1 if the deque is empty.
     *int getRear() Returns the last item from Deque. Returns -1 if the deque is empty.
     *boolean isEmpty() Returns true if the deque is empty, or false otherwise.
     *boolean isFull() Returns true if the deque is full, or false otherwise.
     *
     *
	 */
	
	class MyCircularDeque {
		Deque<Integer> deque = new LinkedList<Integer>();
		int k = 0;

		public MyCircularDeque(int k) {
			this.k = k;
		}

		public boolean insertFront(int value) {
			if (deque.size() == k)
				return false;
			else {
				deque.addFirst(value);
				return true;
			}
		}

		public boolean insertLast(int value) {
			if (deque.size() == k)
				return false;
			else {
				deque.addLast(value);
				return true;
			}
		}

		public boolean deleteFront() {
			if (deque.isEmpty())
				return false;
			else {
				deque.removeFirst();
				return true;
			}
		}

		public boolean deleteLast() {
			if (deque.isEmpty())
				return false;
			else {
				deque.removeLast();
				return true;
			}
		}

		public int getFront() {
			if (deque.isEmpty())
				return -1;
			else
				return (int) deque.peekFirst();
		}

		public int getRear() {
			if (deque.isEmpty())
				return -1;
			else
				return (int) deque.peekLast();
		}

		public boolean isEmpty() {
			return deque.isEmpty();
		}

		public boolean isFull() {
			return deque.size() == k;
		}
	}

}
