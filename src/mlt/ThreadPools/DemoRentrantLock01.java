package mlt.ThreadPools;
//No lock added
public class DemoRentrantLock01 {
	private static int count=0;
		
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread() {
			public void run() {
				incrementor1();
			}			
		};
		
		Thread t2 = new Thread() {
			public void run() {
				incrementor2();
			}
		};
		t1.start();
		t2.start();
		t1.join();
		t2.join();		
		System.out.println(count);

	}
	
	public static void incrementor1() {
		for(int i=0; i<10000; i++) {
			count++;
		}
	}
	public static void incrementor2() {
		for(int i=0; i<10000; i++) {
			count++;
		}		
	}
	
	
}
