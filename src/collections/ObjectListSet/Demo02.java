package collections.ObjectListSet;

//import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
//import java.util.Map;
import java.util.Set;

class Sample {
	int ID;
	String value;

	public Sample(int iD, String value) {
		ID = iD;
		this.value = value;
	}

	@Override
	public String toString() {
		return ("ID= " + ID + " , value= " + value);
	}

}

public class Demo02 {
	public static void main(String[] args) {
//		Map<Sample, String> sampleMap = new LinkedHashMap<Sample, String>();
		Set<Sample> sampleSet = new LinkedHashSet<Sample>();

		sampleSet.add(new Sample(1, "One"));
		sampleSet.add(new Sample(2, "Two"));
		sampleSet.add(new Sample(1, "One"));

		System.out.println(sampleSet);

		// sampleMap.put(1, "One");
		// sampleMap.put(2, "Two");
		// sampleMap.put(1, "Three");
		//
		// System.out.println(sampleMap);
	}

}
