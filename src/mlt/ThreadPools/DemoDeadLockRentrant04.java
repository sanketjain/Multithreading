package mlt.ThreadPools;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DemoDeadLockRentrant04 {

	public static void main(String[] args) {
		Lock lock1 = new ReentrantLock(); 
		Lock lock2 = new ReentrantLock(); 

		Thread t1 = new Thread() {
			public void run() {
				lock1.lock();
				System.out.println("Lock1 on thread t1");
				lock2.lock();
				System.out.println("Lock2 on thread t1");
				lock1.unlock();
				lock2.unlock();
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				lock2.lock(); //Deadlock situation
				System.out.println("Lock1 on thread t2");
				lock1.lock(); //Deadlock situation
				System.out.println("Lock2 on thread t2");
				lock1.unlock();
				lock2.unlock();

			}
		};
		t1.start();
		t2.start();
	}
}
