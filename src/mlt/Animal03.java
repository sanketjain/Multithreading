package mlt;
//start method
class Cat03 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Step: " + i);
		}
	}
}

public class Animal03 {

	public static void main(String[] args) {
		Cat03 runner1 = new Cat03();
		runner1.start();

		Cat03 runner2 = new Cat03();
		runner2.start();
	}

}

//Here we used start() method which will start the thread
//And after that run() method would be running, causing different output