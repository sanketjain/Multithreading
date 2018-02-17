package collections.SortedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("Mike");
		names.add("chand");
		names.add("Ryan");
		names.add("Erik");
		names.add("John");
		names.add("Helena");

		Collections.sort(names);
		
		for(String s: names){
			System.out.println(s);
		}
	
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(53);
		numbers.add(2);
		numbers.add(75);
		numbers.add(86);
		numbers.add(24);
		numbers.add(7);

		Collections.sort(numbers);
		
		for(int i: numbers){
			System.out.println(i);
		}
		
		
		
	}

}
