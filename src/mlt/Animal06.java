package mlt;

class Cat06 implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Step: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

// Creating threads and calling start method of those. The objects passed are of class Cat06
public class Animal06 {
	public static void main(String[] args) {
		Thread runner1 = new Thread(new Cat06());
		runner1.start();

		Thread runner2 = new Thread(new Cat06());
		runner2.start();
	}
}

/*
 * Why use Runnable interface instead of Thread class to create a thread?
 * 1. Java does not allow multiple inheritance, so we cannot extend multiple class if we extended thread
 * 2. Using Runnable interface, allows us to implement it. We always have option to implement multiple interface
 */
