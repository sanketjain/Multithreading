package collections.ArrayList;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Zero");
		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		list1.add("Five");

		//faster operation to remove from end
		list1.remove(4);
		System.out.println(list1.get(3));

		//repositioning is slow (Removing from beginning of arraylist is slow)
		list1.remove(0);
		System.out.println(list1.get(3));

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

		for (String s : list1) {
			System.out.println(s);
		}
	}

}
