package collections.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {
		long start, end;
		ArrayList<Object> array_List = new ArrayList<>();
		LinkedList<Integer> linked_List = new LinkedList<Integer>();

		// Adding elements
		start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			linked_List.add(i);
		}
		end = System.currentTimeMillis();
		System.out.println("Total time taken for LinkedList is " + (end - start));

		start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			array_List.add(i);
		}
		end = System.currentTimeMillis();
		System.out.println("Total time taken for ArrayList is " + (end - start));

		// Removing elements
		start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			linked_List.remove(i);
		}
		end = System.currentTimeMillis();
		System.out.println("Total time taken for LinkedList is " + (end - start));

		start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			array_List.remove((array_List.size()) - i);
		}
		end = System.currentTimeMillis();
		System.out.println("Total time taken for ArrayList is " + (end - start));

	}
}
