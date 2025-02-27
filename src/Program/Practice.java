package Program;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String sentence = sc.nextLine();
		String[] words = sentence.split(" ");

		// Use a StringBuilder to build the resulting sentence
		StringBuilder result = new StringBuilder();

		// Iterate over each word in the sentence
		for (String word : words) {
			// Reverse the current word
			String reversedWord = new StringBuilder(word).reverse().toString();
			// Append the reversed word to the result
			//result.append(reversedWord).append(" ");
			System.out.print(reversedWord);
		}
		

		
		
		
	}
}