package StreamsTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestThree {

	public static void main(String[] args) {

		//merging  different list and sort
		List<String>names1=Arrays.asList("Zumaira", "Alam", "Zeeshan", "Za");
		ArrayList<String> names= new ArrayList<String>();
		names.add("Bengalore");
		names.add("Karnataka");
		names.add("Puri");
		names.add("Kolkata");
		names.add("West Bengal");
		
		Stream<String> newStream =Stream.concat(names1.stream(), names.stream());
		//newStream.sorted().forEach(a->System.out.println(a));
		//this will find if zeeshan is present in merged list or not
		boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Zeeshan"));
		System.out.println(flag);
		

	}

}
