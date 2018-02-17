package collections.NaturalOrdering;

import java.util.Set;
import java.util.TreeSet;

class Individual1 implements Comparable<Individual1> {
	private String name;

	public Individual1(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Individual name: " + name;
	}

	@Override
	public int compareTo(Individual1 person) {
		return name.compareTo(person.name);
	}
}

class CustomObjects implements Comparable<CustomObjects> {
	private String name;

	public CustomObjects(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(CustomObjects person) {
		return name.compareTo(person.name);
	}

	@Override
	public String toString() {
		return "CustomObjects name=" + name;
	}

}

public class Demo2 {
	public static void main(String[] args) {
		Set<CustomObjects> set = new TreeSet<CustomObjects>();
		set.add(new CustomObjects("Priya"));
		set.add(new CustomObjects("Selena"));
		set.add(new CustomObjects("John"));
		set.add(new CustomObjects("Shakira"));
		set.add(new CustomObjects("Mike"));
		set.add(new CustomObjects("Amenda"));
		set.add(new CustomObjects("Chaand"));

		for (CustomObjects element : set) {
			System.out.println(element);
		}
	}
}
