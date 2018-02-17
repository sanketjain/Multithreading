package mlt.ThreadPools;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DemoRentrantLock04 {
	private static int count = 0;
	private static Lock lock = new ReentrantLock();
	private static Condition c1 = lock.newCondition();

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread() {
			public void run() {
				lock.lock();
				try {
					c1.await(); // c1.await() method makes thread wait for sometime.
					// Thread name lock.lock() will be released.
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					incrementor1();
				} finally {
					lock.unlock();
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				lock.lock();
				System.out.println("Waiting for input");
				@SuppressWarnings("resource")
				Scanner scan = new Scanner(System.in);
				scan.nextLine();
				c1.signal(); // It will open one specific thread
				try {
					incrementor2();
				} finally {
					lock.unlock();
				}
			}
		};
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(count);

	}

	public static void incrementor1() {
		for (int i = 0; i < 10000; i++) {
			count++;
		}
	}

	public static void incrementor2() {
		for (int i = 0; i < 10000; i++) {
			count++;
		}
	}

}

// Using Condition class
// Wait and notify methods can only be used inside synchronized block
// So we have await and signal methods in Condition class
