package collections.ObjectListSet;

//import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
//import java.util.Map;
import java.util.Set;

class Sample1 {
	int ID;
	String value;

	public Sample1(int iD, String value) {
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
		Sample1 other = (Sample1) obj;
		if (ID != other.ID)
			return false;
		return true;
	}

}

public class Demo03 {
	public static void main(String[] args) {
	//	Map<Sample1, String> sampleMap = new LinkedHashMap<Sample1, String>();
		Set<Sample1> sampleSet = new LinkedHashSet<Sample1>();

		sampleSet.add(new Sample1(1, "One"));
		sampleSet.add(new Sample1(2, "Two"));
		sampleSet.add(new Sample1(1, "One"));

		System.out.println(sampleSet);

	}

}
