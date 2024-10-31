package String;

import java.util.Scanner;

public class ReplaceSpaceWithSpecialCharacter {

	// Java Program to replace the spaces of a string with a specific character

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str= sc.nextLine();
		
		//String str = "On The Blue Moon";
		char ch = '-';
		str = str.replace(' ', ch);
		System.out.println("String after replacing spaces with given character: "+str);
		//System.out.println(str);
	}

}
