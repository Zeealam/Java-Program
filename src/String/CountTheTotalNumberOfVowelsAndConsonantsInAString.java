package String;

import java.util.Scanner;

public class CountTheTotalNumberOfVowelsAndConsonantsInAString {

	// Java Program to count the total number of vowels and consonants in a string

	public static void main(String[] args) {

		int vCount = 0, cCount = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the statement :");
		String str = sc.nextLine();
		System.out.println("The statement is:" + str);
		
		str= str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vCount++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				cCount++;
			}
		}
		System.out.println("Number of vowels: " + vCount);
		System.out.println("Number of consonants: " + cCount);
	}

}
