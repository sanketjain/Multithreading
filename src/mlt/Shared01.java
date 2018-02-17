package mlt;

class Common01 extends Thread {

	public void run() {
		while (true) {   // Infinite loop
			System.out.println("Hello World");
		}
	}

}

public class Shared01 {
	public static void main(String[] args) {
		Common01 c1 = new Common01();
		c1.start();
	}
}
