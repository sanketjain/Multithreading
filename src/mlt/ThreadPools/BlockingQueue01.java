package mlt.ThreadPools;
//This program starts and executes, no output but jvm is running. PRESS STOP!
import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueue01 {

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
		while (true) {
			Thread.sleep(100);
			queue.put(125);
		}
	}

	public static void takeData() throws InterruptedException {
		while (true) {
			Thread.sleep(200);
			queue.take();
		}
	}
}
