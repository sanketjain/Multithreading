package mlt.ThreadPools;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DemoRentrantLock02 {
	private static int count = 0;
	private static Lock lock = new ReentrantLock();

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread() {
			public void run() {
				lock.lock();
				incrementor1();
				lock.unlock();
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				lock.lock();
				incrementor2();
				lock.unlock();
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

/*
 * Advantage: More control over lock as compared to synchronized keyword
 * because synchronized keyword is automatic control
 * 
 * Disadvantage: If the program throws an exception after lock.lock() statement is run, 
 * Then the java will skip executing the unlock statement.
 * Then lock would be permanent till the execution of program, giving unexpected result
 */