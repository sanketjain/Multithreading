package collections.ListIternator;

import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(0);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);

		ListIterator<Integer> loop = list1.listIterator();
		while (loop.hasNext()) {
			System.out.println(loop.next());
		}
		
		System.out.println("Now printing in reverse order");

		while (loop.hasPrevious()) {
			System.out.println(loop.previous());
		}

	}

}
