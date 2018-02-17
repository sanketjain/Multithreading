package mlt.synchronization;

class Common05 {
	private int counter = 0;

	synchronized void incrementCounter1e() { // Usage of synchronize keyword
		for (int i = 0; i < 10_000; i++) {
			counter++;
		}
	}

	int getCounter() {
		return counter;
	}
}

public class DemoAnonymousClassJoinSynchronizedEx {
	public static void main(String[] args) {
		Common05 c1 = new Common05();

		Thread t1 = new Thread() {
			public void run() {
				c1.incrementCounter1e();
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				c1.incrementCounter1e();
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

		System.out.println(c1.getCounter());

	}
}

// Gives expected output. We used synchronized keyword and join method
