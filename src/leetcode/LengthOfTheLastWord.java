package leetcode;

public class LengthOfTheLastWord {
	
	
	public static int lenthOfTheLastWord(String str) {
		int count =0;
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)!=' ') {
				count++;
			}
			else {
				if(count>0) {
					return count;
				}
			}
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		String str="Zeeshan Alam  ";
		int count =lenthOfTheLastWord(str);
		System.out.println(count);
		

	}

}
