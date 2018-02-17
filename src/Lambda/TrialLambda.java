package Lambda;

import java.util.Arrays;
import java.util.List;

public class TrialLambda {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		list.forEach(i -> System.out.println(i));

		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
		list2.forEach(i -> { int addNumber = 10; i = i + addNumber; System.out.println(i); });
		
		List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5);    
		list3.forEach((Integer i) -> System.out.print(i + ","));  
		
		
		
	}
}
