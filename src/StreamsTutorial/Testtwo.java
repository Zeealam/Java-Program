package StreamsTutorial;

import java.util.Arrays;
import java.util.List;

public class Testtwo {

	public static void main(String[] args) {

		// 1.print the name which has last letter a and change to uppercases.
		//with the help of map method this can achives 
//		Stream.of("Zeeshan", "Alam", "zumaira", "humaira").filter(a -> a.endsWith("a")).map(a -> a.toUpperCase())
//				.forEach(a -> System.err.println(a));
//		
		//this will print all name in upper case
		//Stream.of("Zeeshan", "Alam", "zumaira", "humaira").map(a -> a.toUpperCase())
	//	.forEach(a -> System.err.println(a));
		
		//2 print the name which have first letter as a with uppercaes and sort
		
	List<String>name=Arrays.asList("Zumaira", "Alam", "Zeeshan", "Za");
	name.stream().filter(a->a.startsWith("Z")).sorted().map(a->a.toUpperCase()).forEach(a->System.out.println(a));
	}

}
