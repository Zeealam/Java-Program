package String;

import java.util.Scanner;

public class DuplicateCharacters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		String str = sc.nextLine();
		//String string1 = "Great responsibility";    
        int count;    
            
        //Converts given string into character array    
        char characters[] = str.toCharArray();
       
        System.out.println("Duplicate characters in a given string: ");    
        //Counts each character present in the string    
        for(int i = 0; i <characters.length; i++) {    
            count = 1;    
            for(int j = i+1; j <characters.length; j++) {    
                if(characters[i] == characters[j] && characters[i] != ' ') {    
                    count++;    
                    //Set string[j] to 0 to avoid printing visited character    
                    characters[j] = '0';    
                }    
            }    
            //A character is considered as duplicate if count is greater than 1    
            if(count > 1 && characters[i] != '0')    
                System.out.println(characters[i]);    
        }    
	}

}
