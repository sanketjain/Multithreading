package collections.MapsCompare;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(3, "Three");
		map1.put(1, "one");
		map1.put(2, "Two");
		map1.put(5, "Five");
		map1.put(4, "Four");
		for (Map.Entry<Integer, String> entry : map1.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " value is: " + entry.getValue());
		}

		System.out.println("**************** Linked HashMap **************");
		HashMap<Integer, String> map2 = new LinkedHashMap<Integer, String>();
		map2.put(3, "Three");
		map2.put(1, "one");
		map2.put(2, "Two");
		map2.put(5, "Five");
		map2.put(4, "Four");
		for (Map.Entry<Integer, String> entry : map2.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " value is: " + entry.getValue());
		}

		System.out.println("**************** Linked HashMap **************");
		Map<Integer, String> map3 = new TreeMap<Integer, String>();
		map3.put(3, "Three");
		map3.put(1, "one");
		map3.put(2, "Two");
		map3.put(5, "Five");
		map3.put(4, "Four");
		for (Map.Entry<Integer, String> entry : map3.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " value is: " + entry.getValue());
		}

	}

}
