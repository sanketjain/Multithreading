package mlt.ThreadPools;

public class DemoDeadLock01 {

	public static void main(String[] args) {
		final String lock1 = "Lock1";
		final String lock2 = "lock2";
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized(lock1) {
					System.out.println("Lock1 on thread1");
					
					synchronized (lock2) {	
						System.out.println("Lock2 on thread1");
					}
				}				
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized(lock1) {
					System.out.println("Lock1 on thread2");
					
					synchronized (lock2) {	
						System.out.println("Lock2 on thread2");
					}
				}				
			}
		};
		t1.start();
		t2.start();
	}
}
