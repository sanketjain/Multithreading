package mlt;

class Cat {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Step: " + i);
		}
	}
}

public class Animal {

	public static void main(String[] args) {
		Cat runner1 = new Cat();
		runner1.run();

		Cat runner2 = new Cat();
		runner2.run();
	}

}

//Just wrote our run method

/* Order of thread execution:
 * new Thread(); -> new state
 * start() -> Runnable state 
 * run() -> Running state
 * optional: sleep(), wait(), yield() -> Block or waiting stage
 * run() returns -> Terminated/dead state * 
 */