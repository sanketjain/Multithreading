package collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(25);
		set1.add(3);
		set1.add(6);
		set1.add(12);
		set1.add(1);
		System.out.println(set1);

		Set<Integer> set2 = new LinkedHashSet<>();
		set2.add(25);
		set2.add(3);
		set2.add(6);
		set2.add(12);
		set2.add(1);
		System.out.println(set1);

		Set<Integer> set3 = new TreeSet<>();
		set3.add(25);
		set3.add(3);
		set3.add(6);
		set3.add(12);
		set3.add(1);
		System.out.println(set3);

	}

}
