package mlt.ThreadPools;

class StudyEasy02 implements Runnable {

	public void run() {
		System.out.println("Running");
	}

}

public class Demo02ThreadPriority {
	public static void main(String[] args) {
		Thread runner1 = new Thread(new StudyEasy02());
		runner1.start();

		Thread runner2 = new Thread(new StudyEasy02());
		runner2.setPriority(10);
		runner2.start();

		Thread runner3 = new Thread(new StudyEasy02());
		runner3.setPriority(Thread.MIN_PRIORITY);
		runner3.start();

		System.out.println("Thread 1 uses default priority: " + runner1.getPriority());
		System.out.println("Thread 2 priority is: " + runner2.getPriority());
		System.out.println("Thread 3 priority is: " + runner3.getPriority());

	}
}

// Use Thread priority when we want one thread to be finished first as compared
// to other
//
// Thread priorities:
// Minimum: 1
// Maximum: 10
// Normal: 5