package mlt.ThreadPools;

//Try to understand this one:
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DemoDeadLockRentrant05 {

	public static void main(String[] args) {
		Lock lock1 = new ReentrantLock();
		Lock lock2 = new ReentrantLock();

		Thread t1 = new Thread() {
			public void run() {
				while (true) {
					boolean flagLock1 = false;
					boolean flagLock2 = false;
					try {
						flagLock1 = lock1.tryLock();
						flagLock2 = lock2.tryLock();
						if (flagLock1 && flagLock2) {
							System.out.println("Lock1 on Thread t1");
							System.out.println("Lock2 on Thread t1");
						}
					} finally {
						if (flagLock1 && flagLock2) {
							lock1.unlock();
							lock2.unlock();
							break;
						} else if (flagLock1) {
							lock1.unlock();
						} else if (flagLock2) {
							lock2.unlock();
						}
					}
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				while (true) {
					boolean flagLock1 = false;
					boolean flagLock2 = false;
					try {
						flagLock1 = lock1.tryLock();
						flagLock2 = lock2.tryLock();
						if (flagLock1 && flagLock2) {
							System.out.println("Lock1 on Thread t1");
							System.out.println("Lock2 on Thread t1");
						}
					} finally {
						if (flagLock1 && flagLock2) {
							lock1.unlock();
							lock2.unlock();
							break;
						} else if (flagLock1) {
							lock1.unlock();
						} else if (flagLock2) {
							lock2.unlock();
						}
					}
				}
			}
		};
		t1.start();
		t2.start();
	}
}
/*
 * trylock method: Tries to gain the lock If lock is busy, then returns false
 * else returns true
 * 
 */
