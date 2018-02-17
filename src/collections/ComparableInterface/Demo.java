package collections.ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int lenght1, length2;
		lenght1 = o1.length();
		length2 = o2.length();
		if (lenght1 < length2) {
			return -1;
		} else if (lenght1 > length2) {
			return 1;
		}
		return 0;
	}
}

class ReverseIntegerOrder implements Comparator<Integer> {

	@Override
	public int compare(Integer num1, Integer num2) {
		if (num1 < num2) {
			return -(-1);
		} else if (num1 > num2) {
			return -1;
		}
		return 0;
	}
}

public class Demo {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Mike");
		names.add("chand");
		names.add("Ryan");
		names.add("Erik");
		names.add("John");
		names.add("Helena");
		Collections.sort(names, new LengthComparator());
		for (String s : names) {
			System.out.println(s);
		}

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(53);
		numbers.add(2);
		numbers.add(75);
		numbers.add(86);
		numbers.add(24);
		numbers.add(7);
		Collections.sort(numbers, new ReverseIntegerOrder());
		for (int i : numbers) {
			System.out.println(i);
		}
	}
}
