package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountIndividualVowles {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().toLowerCase();
		Map<Character, Integer> vowelCount = new HashMap<>();
		vowelCount.put('a', 0);
		vowelCount.put('e', 0);
		vowelCount.put('i', 0);
		vowelCount.put('o', 0);
		vowelCount.put('u', 0);

		for (char ch : input.toCharArray()) {
			if (vowelCount.containsKey(ch)) {
				vowelCount.put(ch, vowelCount.get(ch) + 1);
			}
		}
		
		System.out.println("Vowels Count is");
		for(Map.Entry<Character, Integer>entry: vowelCount.entrySet()) {
			if(entry.getValue()>0) {
				System.out.println(entry.getKey()+"="+entry.getValue());
				
			}
			
		}

	}

}
