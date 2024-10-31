package String;
import java.util.*; 

public class TakeInputAndFindDuplicateWords {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count;
		System.out.print("Enter the statement- ");  
		String str= sc.nextLine(); 
		
		System.out.println("Statement is: "+str);
		
		//str= str.toLowerCase();
		String words[] = str.split(" ");
		
		System.out.println("Duplicate words in a given string : ");     
        for(int i = 0; i < words.length; i++) {    
            count = 1;    
            for(int j = i+1; j < words.length; j++) {    
                if(words[i].equals(words[j])) {    
                    count++;    
                    //Set words[j] to 0 to avoid printing visited word    
                    words[j] = "0";    
                }    
            }    
		
            //Displays the duplicate word if count is greater than 1    
            if(count > 1 && words[i] != "0")    
                System.out.println(words[i]);    
        }    
	}

}

