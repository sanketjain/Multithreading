package collections.NaturalOrdering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Individual implements Comparable<Individual> {
	private String name;

	public Individual(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Individual name: " + name;
	}

	@Override
	public int compareTo(Individual person) {
		return name.compareTo(person.name);
	}

}

public class Demo {
	public static void main(String[] args) {
		List<Individual> list = new ArrayList<Individual>();
		list.add(new Individual("Chaand"));
		list.add(new Individual("Selena"));
		list.add(new Individual("Mary"));
		list.add(new Individual("Nick"));
		list.add(new Individual("Radnor"));
		list.add(new Individual("ARoy"));
		
		Collections.sort(list);
		for (Individual i : list) {
			System.out.println(i);
		}
	}
}
