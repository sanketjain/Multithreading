package Practice;

public class Car extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}

class CarUsage {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		c1.start();
		c2.start();
	}
}