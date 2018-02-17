package mlt.ThreadPools;
//Some typo in this code. It does not stop by itself
import java.util.concurrent.CountDownLatch;

class Processor03 extends Thread {
	private int sleep;
	@SuppressWarnings("unused")
	private CountDownLatch latch;

	public Processor03(int sleep, CountDownLatch latch, String name) {
		super(name);
		this.sleep = sleep;
		this.latch = latch;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(sleep);
			//Still need to add countdown method
			System.out.println(Thread.currentThread().getName() + " completed processing");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class DemoCountDownLatch02 {
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch1 = new CountDownLatch(4);
		Processor03 one = new Processor03(4000, latch1, "One");
		Processor03 two = new Processor03(3000, latch1, "Two");
		Processor03 three = new Processor03(2000, latch1, "Three");
		Processor03 four = new Processor03(1000, latch1, "Four");

		one.start();
		two.start();
		three.start();
		four.start();

		latch1.await(); //await method alone does not complete countdown latch mechanism
		System.out.println("Main thread execution complete, thread name is: " + Thread.currentThread().getName());
	}
}
