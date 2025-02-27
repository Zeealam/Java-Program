package leetcodeTwoPointerTech;

import java.util.Scanner;

public class Palindromenumber {
	
	public static boolean isPalindrome(String str) {
		
		//String str=String.valueOf(number);
		char []charat=str.toCharArray();
		int start=0,end=charat.length-1;
		
		while(start<end) {
			if(charat[start]!=charat[end]) {
				return false;
			}
			start ++;
			end --;
			
		}
		return true;

		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str=sc.nextLine();
		
		if(isPalindrome(str)) {
			System.out.println(str+ " is a Palndrome.");
		}
		else
			System.out.println(str + " is not a Palindrome");

	}

}
