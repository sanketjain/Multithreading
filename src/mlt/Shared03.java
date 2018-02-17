package mlt;
//Usage of volatile - To avoid caching of counter variable. In real world it's rare but it may happen. 

//If caching happens, we would try to reset counter variable in resetCounter but it would not work

import java.util.Scanner;

class Common03 extends Thread {
	volatile private int counter = 1;

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

public class Shared03 {
	public static void main(String[] args) {
		Common03 c1 = new Common03();
		c1.start();

		System.out.println("Press enter to stop");
		Scanner s1 = new Scanner(System.in);
		s1.nextLine();

		c1.resetCounter();
		s1.close();
	}
}

/*
 * Volatile keyword is used for long and double type variables. Long and double
 * take 64 bits So java stores them in two slots of 32 size each. Due to
 * multithreading, the caching may happen. So we use volatile keyword to avoid
 * that caching. Other option which is more often used instead of volatile keyword
 * is synchronize keyword but not in case of long or double.
 */
