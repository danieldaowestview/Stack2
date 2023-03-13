package p1Stack2;

import java.util.ArrayList;

public class Stack2<T> {
	// use an Queues as the backend structure
	Queue<T> data;
	Queue<T> swap;

	public Stack2() {
		// 2) what should the constructor do?
		data = new Queue<T>();
		swap = new Queue<T>();
	}

	/*
	 * 
	 * Add to the Queue
	 */

	public void push(T el) {
		Queue<T> temp = new Queue();
		while (!data.empty()) {
			swap.add(data.remove()); // move all objects from data
			// to swap to get them into LiFo order
		}
		data = swap;
		swap = temp;

	}

	/*
	 * 
	 * 
	 * Pop from the Queue if not empty
	 */
	public T pop() {
		// )3
		if (!data.empty()) {
			return data.remove();
		}
		return null;
	}

	// return the # of elements in the Queue
	public int size() {
		return data.size();
	}

	public boolean empty() {
		if (data.empty()) {
			return true;
		}
		return false;
	}

	// return peek if data is not empty
	public T peek() {
		if (!data.empty()) {
			return data.peek();
		}
		return null;
	}
}
