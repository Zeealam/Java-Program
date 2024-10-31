package String;

import java.util.Scanner;

public class CountTheNumberOfCharacter {

	// Java Program to count the total number of characters in a string

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word: ");
		String str = sc.nextLine();

		System.out.println("Statement is: " + str);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				count++;
		}
		System.out.println("Total number of characters in a string: " + count);

	}

}
