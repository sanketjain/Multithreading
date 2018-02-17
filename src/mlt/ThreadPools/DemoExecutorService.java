package mlt.ThreadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Worker implements Runnable {
	private int workerId;

	public Worker(int workerId) {
		this.workerId = workerId;
	}

	public void run() {
		System.out.println("Work assigned by worker Id: " + workerId);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Work completed! by worker Id: " + workerId);
	}

}

public class DemoExecutorService {

	public static void main(String[] args) {
		ExecutorService executor1 = Executors.newFixedThreadPool(3); // Create thread pool of 3 threads
		for (int count = 0; count < 20; count++) {
			executor1.submit(new Worker(count));
		}

		executor1.shutdown();

		try {
			executor1.awaitTermination(1, TimeUnit.HOURS); // If thread executive is not over in 1 hour, then terminate
															// (forcibly)
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// while(!executor1.isTerminated()) {
		// System.out.println("Not yet terminated");
		// }
		System.out.println("All work done");
	}
}
