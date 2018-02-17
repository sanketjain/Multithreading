package mlt.ThreadPools;
//Countdownlatch allows to control execution sequence of thread
import java.util.concurrent.CountDownLatch;

class Processor01 extends Thread {
	private int sleep;
	@SuppressWarnings("unused")
	private CountDownLatch latch; // CountDownLatch is a thread safe class. No need to worry about synchronization

	public Processor01(int sleep, CountDownLatch latch, String name) {
		super(name);
		this.sleep = sleep;
		this.latch = latch;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(sleep); //value of sleep parameter is same as constructor
			//Should have called countDown method here
			System.out.println(Thread.currentThread().getName() + " completed processing");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class DemoCountDownLatch {
	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(4); //specify latch to a counter variable
		Processor01 one = new Processor01(4000, latch, "One");
		Processor01 two = new Processor01(3000, latch, "Two");
		Processor01 three = new Processor01(2000, latch, "Three");
		Processor01 four = new Processor01(1000, latch, "Four");

		one.start();
		two.start();
		three.start();
		four.start();

		System.out.println("Main thread execution complete, thread name is: " + Thread.currentThread().getName());
		// Here countdownlatch mechanism is not complete
	}
}
