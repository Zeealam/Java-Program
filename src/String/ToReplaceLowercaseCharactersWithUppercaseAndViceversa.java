package String;

import java.util.Scanner;

public class ToReplaceLowercaseCharactersWithUppercaseAndViceversa {

	// Java Program to replace lower-case characters with upper-case and vice-versa

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();

		StringBuffer strbuff = new StringBuffer(str);

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				strbuff.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			} else if (Character.isUpperCase(str.charAt(i))) {
				strbuff.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println("String after conversation:" + strbuff);
	}

}
