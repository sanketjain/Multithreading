package mlt.ThreadPools;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DemoRentrantLock03 {
	private static int count = 0;
	private static Lock lock = new ReentrantLock();

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread() {
			public void run() {
				lock.lock();
				try { 
					incrementor1(); //To prevent lock if lock.lock() throws exception
				} finally {
					lock.unlock();					
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				lock.lock();
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
