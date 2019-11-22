package lee.unit2;

import java.util.Scanner;

public class PrimeNumbers {
	/**
	 *<br>A program that incorpates the while loop and if statement to
	 *<br>check if the number entered by the user is prime or not
	 * <br>created on Oct 8th, 2019
	 *<br>@author Charlie Lee
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Variables
		double chosenNumber;
		double nonConstant = 2;
		
		//prompts the user for a number
		System.out.println("Please enter a number, we will check if its prime or not");
		chosenNumber = sc.nextDouble();
		
		//The limit to make sure the computer does not lag or take too long
		 double limit = chosenNumber - 1;

		 //Loop to multiply constantly till the limit is reached (checks if its prime or not)
		while (nonConstant != limit)
		{
			  chosenNumber = chosenNumber % nonConstant;
			 
              //Checks if the number is prime or not (if remainder = 0 it is not prime (e.g. 12/6 has no remainder))
			  if (chosenNumber == 0)
			  {
				  System.out.println("Your number is not a prime");
				  break;
		      }
		
			  if (chosenNumber !=0)
			  {
				  System.out.println("Your number is a prime");
				  break;
			  }
			  //Counter for the amount of loops
			  nonConstant = nonConstant + 1;
		}



	}

}
