package mlt.synchronization;

class Common01 {
	synchronized void counter(int unit) {
//	void counter(int unit) {
		for (int i = 0; i < 10; i++) {
			System.out.println(unit * i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class incrementor1a implements Runnable {
	Common01 c;

	incrementor1a(Common01 c) {
		this.c = c;
	}

	public void run() {
		c.counter(5);
	}
}

class incrementor2a implements Runnable {
	Common01 c;

	incrementor2a(Common01 c) {
		this.c = c;
	}

	public void run() {
		c.counter(2);
	}
}

public class DemoMethodLevelRunnable {
	public static void main(String[] args) {
		Common01 demo = new Common01();
		Thread t1 = new Thread(new incrementor1a(demo));
		Thread t2 = new Thread(new incrementor2a(demo));
		t1.start();
		t2.start();
	}
}
