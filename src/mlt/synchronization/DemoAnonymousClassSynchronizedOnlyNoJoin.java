package mlt.synchronization;

class Common06 {
	private int counter = 0;

	synchronized void incrementCounter1f() { // Usage of synchronize keyword
		for (int i = 0; i < 10_000; i++) {
			counter++;
		}
	}

	int getCounter() {
		return counter;
	}
}

public class DemoAnonymousClassSynchronizedOnlyNoJoin {
	public static void main(String[] args) {
		Common06 c1 = new Common06();

		Thread t1 = new Thread() {
			public void run() {
				c1.incrementCounter1f();
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				c1.incrementCounter1f();
			}
		};

		t1.start();
		t2.start();

		System.out.println(c1.getCounter());

	}
}
// Gives wrong output because we did not join two threads.