package mlt;
//run method. Extending thread class
class Cat02 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Step: " + i);
		}
	}
}

public class Animal02 {

	public static void main(String[] args) {
		Cat02 runner1 = new Cat02();
		runner1.run();

		Cat02 runner2 = new Cat02();
		runner2.run();
	}

}

//extend thread class but run() method does not start the thread. 
//first we need to use the start() method. 

