package mlt.synchronization;

public class DemoSynchronizedClassLevel01 {
	private static int counter1; // Using static keyword. Class Level
	private static int counter2;
	Object obj1 = new Object();
	Object obj2 = new Object();

	public void incrementCounter1() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		synchronized (obj1) { // Class level synchronization as counter is static
			counter1 = counter1 + 1;
		}
	}

	public void incrementCounter2() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (obj2) {
			counter2 = counter2 + 1;
		}
	}

	public void incrementAll() {
		for (int index = 0; index < 1000; index++) {
			incrementCounter1();
			incrementCounter2();
		}
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		System.out.println("Started Main");
		long startTime = System.currentTimeMillis();

		DemoSynchronizedClassLevel01 demoSB = new DemoSynchronizedClassLevel01();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				demoSB.incrementAll();
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				demoSB.incrementAll();
			}
		});

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Final value of counter1 is: " + demoSB.counter1);
		System.out.println("Final value of counter2 is: " + demoSB.counter2);

		long endTime = System.currentTimeMillis();
		System.out.println("Time take is: " +  (endTime - startTime));

	}

}
