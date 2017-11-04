package LabNumber6Six;
import java.util.Scanner;
public class labNumber6SixTogether {

	// So we need to look at the first character (look at process input)
	public static void main(String[] args) {
		// Pig Latin Project
		// Define Variables
		// 1. String input
		// 2. String translated
		// 3. char first letter

		// Defining our variables
		String userInput;
		String translatedWord;
		char firstLetter;
		
		// Process Input
		// look at first character
		// Output Results

		// Read Input
		// 1. Scanner(input)
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter a word to be translated: ");

		// change the userInput to lower case in one line
		userInput = scan1.nextLine().toLowerCase();

		// setting the translated word equal to the user input minus the first letter
		translatedWord = userInput.substring(1);

		// setting first letter equal to the user input's first letter
		firstLetter = userInput.charAt(0);
		translatedWord = translatedWord + firstLetter + "ay";
		
		
		//so we need to check if the first letter is a vowel then we need it to end it in way		
		if (firstLetter == 'a' || firstLetter == 'e'|| firstLetter == 'i' || firstLetter == 'o'||firstLetter == 'u')
				{
					System.out.println(userInput + "way");
					
				} else {
		//if it doesn't begin with a vowel then we use this translatedWord = translatedWord + firstLetter + "ay";
		System.out.println(translatedWord);
				}
		scan1.close();
	}

}
