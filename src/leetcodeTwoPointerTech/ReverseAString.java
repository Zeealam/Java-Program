package leetcodeTwoPointerTech;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		// Two pointer technique 

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the string:");
//		String s = sc.nextLine();
		String s="Zeeshan Alam";
		char reverse[] = s.toCharArray();

		int start = 0, end = reverse.length - 1;
		while (start < end) {
			char temp = reverse[end];
			reverse[end] = reverse[start];
			reverse[start] = temp;
			start++;
			end--;
		}
		System.out.println(reverse);
		
	}

}
