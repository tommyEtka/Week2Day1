package LabNumber6Six;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionTryCatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Please enter a number");

			int input = scan.nextInt();
			System.out.println(input);
			
			//need to import inputmismatchexception
		} catch (InputMismatchException e) {
			System.out
					.println("You must enter a valid number! Contact helpdesk" + e);
			//the e on the end tells you what the exception is
		}

		scan.close();

	}

}
