package collections.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "one");
		map1.put(2, "Two");
		map1.put(3, "Three");
		map1.put(4, "Four");
		map1.put(5, "Five");
		// System.out.println("Value for key 5 is: " + map1.get(5));

		// for(Map.Entry<Integer, String> entry: map1.entrySet()){
		// System.out.println("Key: " + entry.getKey() + " value is: " +
		// entry.getValue());
		// }

		// for (Integer entry : map1.keySet()) {
		// System.out.println("Key: " + entry + " value is: " +
		// map1.get(entry));
		// }
		
		Iterator<Map.Entry<Integer, String>> entry = map1.entrySet().iterator();
		while(entry.hasNext()){
			Map.Entry<Integer, String> temp = entry.next();
			System.out.println("Key: " + temp.getKey() + " Value: " + temp.getValue());
		}
	}

}
