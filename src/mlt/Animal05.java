package mlt;
//Creating thread by implementing runnable. 
class Cat05 implements Runnable {
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
// Start method does not work. Use run() method as Runnable only has run.
public class Animal05 {
	public static void main(String[] args) {
		Cat05 runner1 = new Cat05();
		runner1.run();

		Cat05 runner2 = new Cat05();
		runner2.run();
	}
}
