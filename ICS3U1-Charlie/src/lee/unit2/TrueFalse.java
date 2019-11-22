package lee.unit2;

import java.util.Scanner;
/**
 * A true or false system for positive and negative and to check if the output is divisble by 7
 * created on Sept 18, 2019
 *@author Charlie Lee
 */
public class TrueFalse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//prompts the user for a number
		System.out.println("What is your chosen number?");
		int number = sc.nextInt();
		
		//This checks if the number is either positive negative
		if (number >=0)
		{
			System.out.println("your number is a positive value");
			
		}
		else
		{
		System.out.println("This number is a negative value");
		}
		
		
		int divisble;
		divisble = number%7;
		
		//This checks if the number is divisible is 7
		//e.g. if the number is 6, 6 divided by 7 has a remainder which makes it not divisible b 7
		if (divisble==0)
		{
			System.out.println("This number is divisble by 7");
		}
		else
		{
			System.out.println("This number is not divisble by 7");
		}
	}

}
