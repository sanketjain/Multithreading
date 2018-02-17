package collections.Dequeue;

import java.util.ArrayDeque;

public class Demo {

	public static void main(String[] args) {
		ArrayDeque<Integer> dequeue = new ArrayDeque<Integer>();

		dequeue.addLast(1);
		dequeue.addLast(2);
		dequeue.addLast(3);
		dequeue.addLast(4);

		for (Integer element : dequeue) {
			System.out.println(element);
		}

		System.out.println("********************");

		dequeue.addFirst(0);
		dequeue.addLast(5);
		// dequeue.add(6);
		// dequeue.remove();
		// dequeue.removeFirst();
		dequeue.removeLast();

		for (Integer element : dequeue) {
			System.out.println(element);
		}

	}
}
