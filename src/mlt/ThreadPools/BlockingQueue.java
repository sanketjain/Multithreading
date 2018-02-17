package mlt.ThreadPools;
//Usage of ArrayBlockingQueue class
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueue {

	private static ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread() {
			public void run() {
				try {
					putData();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				try {
					takeData();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}

	public static void putData() throws InterruptedException {
		Random randomField = new Random();
		int temp;
		while (true) {
			temp = randomField.nextInt(10);
			Thread.sleep(500);
			queue.put(temp);
			System.out.println("Value added to queue: " + temp + " current size of queue " + queue.size());
		}
	}

	public static void takeData() throws InterruptedException {
		while (true) {
			Thread.sleep(1500);
			System.out.println(
					"Value taken out from queue: " + queue.take() + ". The current size of queue: " + queue.size());
		}
	}
}


/* This code works perfectly even though we have not used synchronization of threads. Why?
 * Because ArrayBlockingQueue is thread safe class
 * put and take method on arrayblockingqueue object here are thread safe
 */
