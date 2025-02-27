package String;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter a sentence
		System.out.print("Enter a sentence: ");
		String sentence = sc.nextLine();

		// Reverse each word in the sentence
		String reversedSentence = reverseEachWord(sentence);

		// Print the resulting sentence
		System.out.println("Sentence with each word reversed: " + reversedSentence);

		sc.close();
	}

	public static String reverseEachWord(String sentence) {
		// Split the sentence into words
		String[] words = sentence.split(" ");

		// Use a StringBuilder to build the resulting sentence
		StringBuilder result = new StringBuilder();

		// Iterate over each word in the sentence
		for (String word : words) {
			// Reverse the current word
			String reversedWord = new StringBuilder(word).reverse().toString();
			// Append the reversed word to the result
			result.append(reversedWord).append(" ");
		}

		// Convert the StringBuilder to a String and trim any trailing spaces
		return result.toString().trim();
	}

}
