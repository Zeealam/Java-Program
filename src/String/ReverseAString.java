package String;

import java.util.Scanner;

public class ReverseAString {

	// Java Program to find Reverse of the string

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str= sc.nextLine();
		//String str = "Zeeshan";
		String revstr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revstr = revstr + str.charAt(i);
		}
		System.out.println("Original String :" + str);

		System.out.println("Reverse String :" + revstr);
	}

}