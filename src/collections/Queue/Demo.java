package collections.Queue;

import java.util.concurrent.LinkedBlockingQueue;

public class Demo {

	public static void main(String[] args) {

		LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>(5);

		// try {
		// queue.remove();
		// } catch (NoSuchElementException e) {
		// System.out.println("Queue is Empty");
		// }

		// queue.add(1);
		// queue.add(2);
		// queue.add(3);
		// queue.add(4);
		// queue.add(5);

		// try {
		// queue.add(0);
		// } catch (IllegalStateException e) {
		// System.out.println("Queue is full");
		// }

		// System.out.println("Head of queue: " + queue.element());

		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		// System.out.println(queue.offer(6));
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
		System.out.println(queue.peek());
		
		
		for (Integer elemento : queue) {
			System.out.println("Queue element: " + elemento);
		}
	}
}
