package LabNumber6Six;

import java.util.Scanner;

public class labNumber6Six {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	

		System.out.println("Welcome to the Pig Translator:");
		System.out.println("Enter a line to be translated: ");
		
		
		Scanner scan1 = new Scanner(System.in);
		
		
		
		String findFirstVowel = scan1.nextLine();
        char v = Character.toLowerCase(findFirstVowel.charAt(0));
        
    
        

        if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u')
        {
            String convertToPigLatin = findFirstVowel + "way";
            String lowerCase = convertToPigLatin.toLowerCase();
            System.out.println(lowerCase);
           
            
          
        }
        else
        	
        {
        	for(int i= 0 ; i <= findFirstVowel.charAt(i); i++)
        	{
        		
        	}
        		
        }
        	
        	
        	
   
       /* {	
        	String first = findFirstVowel.substring(0,1);
            String lowerFirst = first.toLowerCase();
            String slice = findFirstVowel.substring(1,findFirstVowel.length());
            String lowerSlice = slice.toLowerCase();
            System.out.println(lowerSlice + lowerFirst + "ay");  
       
       
	}*/

        scan1.close();
  
	
	}

	
}
	


