package mlt.synchronization;
//synchronized method

class Common02 {
	synchronized void counter(int unit) {
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

class incrementor1b extends Thread {
	Common02 c;
	incrementor1b(Common02 c) {
		this.c = c;
	}
	public void run() {
		c.counter(5);
	}
}

class incrementor2b extends Thread {
	Common02 c;
	incrementor2b(Common02 c) {
		this.c = c;
	}
	public void run() {
		c.counter(2);
	}
}

public class DemoMethodLevelThread {
	public static void main(String[] args) {
		Common02 demo = new Common02();
		incrementor1b t1 = new incrementor1b(demo);
		incrementor2b t2 = new incrementor2b(demo);
		t1.start();
		t2.start();
	}
}
