package StreamsTutorial;

import java.util.ArrayList;

public class TestOne {
	//Stream filter used
	//Count the number of name starting with Z in list
	public static void main(String[] args) {
		ArrayList<String> names= new ArrayList<String>();
		names.add("Zeeshan");
		names.add("Alam");
		names.add("Zunaira");
		names.add("Kolkata");
		names.add("West Bengal");
		
//		int count =0;
//		for(int i=0;i<names.size();i++) {
//			String actual =names.get(i);
//			if(actual.startsWith("Z")) {
//				count++;
//			}
//		}
//		System.out.println(count);
		//there is no life for intermediate op if there is no terminal op
		//terminal operation will execute only if intermediate op (filter) return true
		//We can create stream
		//how to use filter in stream
		
		Long count =names.stream().filter(a->a.startsWith("Z")).count();//count is a ternally operator
		System.out.println(count);
		//print all the name in arraylist
		//names.stream().filter(a->a.length()>4).forEach(s->System.out.println(s));
		//print only the first name from list
		// limit is a trenally operator
		names.stream().filter(a->a.length()>4).limit(1).forEach(a->System.out.println(a));
	}
}