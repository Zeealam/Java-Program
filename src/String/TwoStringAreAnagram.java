package String;

import java.util.Arrays;
import java.util.Scanner;

public class TwoStringAreAnagram {

	// Java Program to determine whether two strings are the anagram

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the First String");
		String str1= sc1.nextLine();
		
		Scanner sc2= new Scanner(System.in);
		System.out.println("Enter the Second String");
		String str2= sc2.nextLine();
		
		//String str1 = "qwer";
		//String str2 = "rweq";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() != str2.length()) {
			System.out.println("Both String are not Anagram");
		} else {
			char string1[] = str1.toCharArray();
			char string2[] = str2.toCharArray();

			Arrays.sort(string1);
			Arrays.sort(string2);

			if (Arrays.equals(string1, string2) == true) {
				System.out.println("Both String are anagram");
			} else {
				System.out.println("Both the string are not anagram");
			}
		}

	}

}
