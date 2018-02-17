package mlt;

//Introduce scanner to stop infinite loop when user presses the enter key
import java.util.Scanner;

class Common02 extends Thread {
	private int counter = 1;

	public void run() {
		while (true) {
			System.out.println("Hello World infinite");
			if (counter == 0) {
				break;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void resetCounter() {
		counter = 0;
	}

}

public class Shared02 {
	public static void main(String[] args) {
		Common02 c1 = new Common02();
		c1.start();

		System.out.println("Press enter to stop");
		Scanner s1 = new Scanner(System.in);
		s1.nextLine();
		c1.resetCounter();
		s1.close();
	}
}

/*
 * Double check if following is correct. There are two threads running here:
 * c2 thread is dependent on counter variable (first thread) 
 * whereas we are resetting the counter variable using the main thread (another thread)
 */
