package mlt.synchronization;

class Common04 {
	private int counter = 0;

	void incrementCounter1d() {
		for (int i = 0; i < 10_000; i++) {
			counter++;
		}
	}

	int getCounter() {
		return counter;
	}
}

public class DemoAnonymousClassJoin {
	public static void main(String[] args) {
		Common04 c1 = new Common04();

		Thread t1 = new Thread() {
			public void run() {
				c1.incrementCounter1d();
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				c1.incrementCounter1d();
			}
		};

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		/*
		 * join() is a instance method of java.lang.Thread class which we can use join()
		 * method to ensure all threads that started from main must end in order in
		 * which they started and also main should end in last. In other words waits for
		 * this thread to die
		 */
		System.out.println(c1.getCounter());

	}
}
// This is better program than last one.
// But the output is still not as expected because methods are not synchronized
