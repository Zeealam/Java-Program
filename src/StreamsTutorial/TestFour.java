package StreamsTutorial;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFour {

	public static void main(String[] args) {
        //collect is a method
		List <String>ls= Stream.of("Zeeshan", "Alam", "zumaira", "humaira").filter(a -> a.endsWith("a")).map(a -> a.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		List<Integer> value= Arrays.asList(3,3,2,4,5,4);
		//print the unique number for this array
		//value.stream().distinct().forEach(a->System.out.println(a));
		//sort the array 2 3 4 5 , print the 3rd value
		List <Integer> lt =value.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(lt.get(2));
	}

}