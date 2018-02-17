package collections.ObjectListSet;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Sample2 {
	int ID;
	String value;

	public Sample2(int iD, String value) {
		ID = iD;
		this.value = value;
	}

	@Override
	public String toString() {
		return ("ID= " + ID + " , value= " + value);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sample2 other = (Sample2) obj;
		if (ID != other.ID)
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

}

public class Demo04 {
	public static void main(String[] args) {
		Map<Sample2, String> sampleMap = new LinkedHashMap<Sample2, String>();
		Set<Sample2> sampleSet = new LinkedHashSet<Sample2>();
		
		sampleSet.add(new Sample2(1, "One"));
		sampleSet.add(new Sample2(2, "One"));
		sampleSet.add(new Sample2(1, "One"));

		System.out.println(sampleSet);
		
		sampleMap.put(new Sample2(1, "One"), "First");
		sampleMap.put(new Sample2(2, "Two"), "Second");
		sampleMap.put(new Sample2(3, "Three"), "Third");
		System.out.println(sampleMap);

	}

}
