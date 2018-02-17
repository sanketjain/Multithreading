package collections.ObjectListSet;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Demo01 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Map sampleMap = new LinkedHashMap();
		@SuppressWarnings("rawtypes")
		Set sampleSet = new LinkedHashSet();

		sampleSet.add(1);
		sampleSet.add(2);
		sampleSet.add(1);

		// System.out.println(sampleSet);

		sampleMap.put(1, "One");
		sampleMap.put(2, "Two");
		sampleMap.put(1, "Three");

		System.out.println(sampleMap);
	}

}
