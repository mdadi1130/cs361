/**
 * 
 */
package mystack;

/**
 * @author Michael Dadi
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		T val = null;
		if (!isEmpty()) {
			theStack = theStack.next;
			val = theStack.val;
		}
		return val;
	}

	public void push(T v) {
		if (isEmpty()) {
			theStack = new MyNode<>(v, null);
		} else {
			theStack = new MyNode<>(v, theStack);
		}
	}

	public boolean isEmpty() {
		return theStack == null;
	}

	public String toString() {
		MyNode<T> current = theStack;
		StringBuilder sb = new StringBuilder();

		while (current != null) {
			sb.append(current.val).append("\t");
			current = current.next;
		}
		return sb.toString();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Integer stack
		MyStack<Integer> intStack = new MyStack<>();
		intStack.push(1);
		intStack.push(2);
		intStack.pop();
		intStack.push(5);

		System.out.println(intStack.toString());

		// Person stack
		MyStack<Person> personStack = new MyStack<>();

		Person p1 = new Person("Michael", "Dadi");
		personStack.push(p1);

		Person p2 = new Person("Professor", "Scharff");
		personStack.push(p2);

		System.out.println(personStack.toString());
	}

}
