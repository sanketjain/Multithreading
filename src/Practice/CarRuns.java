package Practice;

public class CarRuns implements Runnable {
	public void run() {
		System.out.println("Car Runs");
	}

}

class CarRunsWithStarter {
	public static void main(String[] args) {
		Thread t1 = new Thread();
		t1.start();
	}
}