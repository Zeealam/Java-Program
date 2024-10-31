package String;

import java.util.Scanner;

public class CountTheTotalNumberOfPunctuationCharactersExistsInAString {

	// Java Program to Count the Total Number of Punctuation Characters Exists in a
	// String

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input: ");
		String str = sc.nextLine();
		System.out.println("The input is : " + str);

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.'
					|| str.charAt(i) == '?' || str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') {
				count++;
			}
		}
		System.out.println("The number of punctuations exists in the string is: " + count);
	}

}
