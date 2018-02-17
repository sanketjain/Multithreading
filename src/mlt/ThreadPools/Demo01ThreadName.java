package mlt.ThreadPools;

class StudyEasy01 implements Runnable {

	public void run() {
		System.out.println("Running");
	}

}

public class Demo01ThreadName {
	public static void main(String[] args) {
		Thread runner1 = new Thread(new StudyEasy01());
		runner1.start();
		Thread runner2 = new Thread(new StudyEasy01());
		runner2.start();

		System.out.println("Name of the thread: " + runner1.getName());
		System.out.println("Name of the thread: " + runner2.getName());

		runner1.setName("Runner1");
		runner2.setName("Runner2");
		System.out.println("Name of the thread: " + runner1.getName());
		System.out.println("Name of the thread: " + runner2.getName());
	}
}

//It is possible to rename threads with getter and setters