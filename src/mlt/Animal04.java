package mlt;
//Sleep method
class Cat04 extends Thread {
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

public class Animal04 {
	public static void main(String[] args) {
		Cat04 runner1 = new Cat04();
		runner1.start(); //Notice how we are calling start method and not the run method

		Cat04 runner2 = new Cat04();
		runner2.start();
	}

}

// Sleep method needs to be enclosed or surrounded by try/catch
// Sleep method throws exception
