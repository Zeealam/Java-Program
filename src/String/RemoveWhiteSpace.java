package String;

import java.util.Scanner;

public class RemoveWhiteSpace {

	// Java Program to remove all the white spaces from a string

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str= sc.nextLine();
		
		//String str = "My name is Zeeshan";
		//str = str.replaceAll("\\s", "");
		
		str=str.replace(" ", "");

		System.out.println("String after removing all the space: " + str);
	}

}
