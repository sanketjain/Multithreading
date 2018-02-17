package mlt.synchronization;
//Usage of join method and anonymous class

class Common03 {
	private int counter = 0;

	void incrementCounter1c() {
		for (int i = 0; i < 10_000; i++) {
			counter++;
		}
	}

	int getCounter() {
		return counter;
	}
}

public class DemoAnonymousClass {
	public static void main(String[] args) {
		Common03 c1 = new Common03();

		Thread t1 = new Thread() {
			public void run() {
				c1.incrementCounter1c();
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				c1.incrementCounter1c();
			}
		};

		t1.start();
		t2.start();
		System.out.println(c1.getCounter());

	}
}

/*
 * Here when we run program, 3 threads run: t1, t2 and one thread for program
 * execution itself even after line 44 t1 and t2 continue execution
 */
