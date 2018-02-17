package collections.SetOperators;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		Set<String> set1 = new LinkedHashSet<>();
		set1.add("one");
		set1.add("two");
		set1.add("three");
		set1.add("four");
		set1.add("five");
		set1.add("six");
		set1.add("seven");

		// for(String element: set1){
		// System.out.println(element);
		// }

		Set<String> set2 = new LinkedHashSet<>();
		set2.add("two");
		set2.add("two");
		set2.add("three");
		set2.add("nine");
		set2.add("eight");
		set2.add("six");
		set2.add("ten");

		set1.addAll(set2); // Union
		// set1.retainAll(set2); //Intersection
		// set1.removeAll(set2); //Difference
		Iterator<String> ir = set1.iterator();
		while (ir.hasNext()) {
			System.out.println(ir.next());
		}

	}
}
