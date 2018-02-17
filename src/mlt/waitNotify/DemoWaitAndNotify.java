package mlt.waitNotify;

class StudyEasy extends Thread {
	int counter = 0;

	public void run() {
		synchronized (this) {
			for (int index = 0; index < 100; index++) {
				counter++;
			}
			notify();
			System.out.println("Notify method called");
		}
	}

}

public class DemoWaitAndNotify {
	public static void main(String[] args) {
		StudyEasy SEO = new StudyEasy();
		SEO.start();
		synchronized (SEO) {
			try {
				System.out.println("Value of counter just before wait method: " + SEO.counter);
				SEO.wait(); // Waits till the execution of SEO is finished.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Final value of counter variable is: " + SEO.counter);
		}

	}
}
