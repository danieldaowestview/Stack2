package p1Stack2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class Stack2Test {

	@Test
	void test() {
		// fail("Not yet implemented");
	}

	@Test
	void testSize() {
		// fail("Not yet implemented");
		Stack2<Integer> temp = new Stack2<Integer>();
		// assertEquals(expected, actual)
		assertEquals(0, temp.size());

	}

	@Test
	void testPush() {
		// What could we write that uses Stack to test that it is functioning
		// expected and minimizes the other
		// parts of its code
		// fail("Not yet implemented");
		Stack2<Integer> temp = new Stack2<Integer>();
		temp.push(1);
		assertEquals(1, temp.size());
	}

	@Test
	void testPop() {
		// fail("Not yet implemented");
		/*
		 * what series of code can you write
		 * 
		 * 
		 * test if can is less one size
		 */
		Stack2<Integer> temp = new Stack2<Integer>();
		temp.push(1);
		temp.push(1);
		temp.pop();
		assertEquals(1, temp.size());
	}

	@Test
	void testEmpty() {
		/*
		 * 
		 * Test if empty
		 */
		Stack2<Integer> temp = new Stack2<Integer>();
		assertEquals(true, temp.empty());
	}

	@Test
	void testPeek() {
		Stack2<Integer> temp = new Stack2<Integer>();
		temp.push(1);
		assertEquals(1, temp.peek());
	}
}
