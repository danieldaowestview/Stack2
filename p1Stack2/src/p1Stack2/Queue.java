package p1Stack2;

public class Queue<T> {

	/* to be completed */
	// instance variables
	Stack2<T> pop;
	Stack2<T> push;
	
	/* to be completed */
	// constructor
	public Queue() {
		pop = new Stack2<T>();
		push = new Stack2<T>();
	}

	// remove and return the element at the beginning of the list
	public T remove() {
		if (pop.size() ==0) {
			while(!push.empty()) {
				pop.push(push.pop());
			}
		}
		return pop.pop();
	}

	// add element at the end of the list
	public void add(T el) {
		/* to be completed */
		push.push(el);
	}
	// return a String representation of the list
	// formatted as [el1, el2, el3, ..., elN]
	public String toString() {
	    Stack2<T> tempStack = new Stack2<T>();
		String res = "["; 
		if(empty()){
		    return null;
		}
		while(!pop.empty()){
			T el = pop.pop();
			res += el.toString() + ", ";
			tempStack.push(el);
		}
		while(!tempStack.empty()){
		    T el = tempStack.pop();
		    pop.push(el);
		}
		
		while(!push.empty()){
			tempStack.push(push.pop());
		}
		while(!tempStack.empty()){
		    T el = tempStack.pop();
		    res += el.toString() + ", ";
		    push.push(el);
		}
		
		res = res.substring(0, res.length() - 2);
		res += "]";

		return res;
	}

	/* return the # of elements in the queue */
	public int size() {
		return push.size() + pop.size();
	}

	/* return true if the queue is empty, false otherwise */
	public boolean empty() {
		if (push.size() == 0 && pop.size() == 0) {
			return true;
		}
		return false;
	}
	
	public T peek() {
		return pop.peek();
	}

}