package mlt.ThreadPools;

import java.util.concurrent.CountDownLatch;

class Processor02 extends Thread {
	private int sleep;
	
	private CountDownLatch latch;

	public Processor02(int sleep, CountDownLatch latch, String name) {
		super(name);
		this.sleep = sleep;
		this.latch = latch;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(sleep);
			latch.countDown(); //each call of countDown decreases the value of latch by one
			System.out.println(Thread.currentThread().getName() + " completed processing");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class DemoCountDownLatchFull {
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch = new CountDownLatch(4);
		Processor02 one = new Processor02(4000, latch, "One");
		Processor02 two = new Processor02(3000, latch, "Two");
		Processor02 three = new Processor02(2000, latch, "Three");
		Processor02 four = new Processor02(1000, latch, "Four");

		one.start();
		two.start();
		three.start();
		four.start();

		latch.await(); //waits till the latch value becomes zero
		//when latch value becomes 0, the thread would be released and the main thread would continue with execution
		System.out.println("Main thread execution complete, thread name is: " + Thread.currentThread().getName());
	}
}
