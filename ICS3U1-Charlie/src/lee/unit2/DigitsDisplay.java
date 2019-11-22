package lee.unit2;
/**
 *<br>A program that incorpates the do while loop to
 *<br>display each digit seperately of the number entered
 * <br>created on Oct 8th, 2019
 *<br>@author Charlie Lee
 */

import java.util.Scanner;

public class DigitsDisplay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//prompts the user for a positive integer
		System.out.println("Enter a positive integer");
		int digits = sc.nextInt();
        
		//variables
		int number;
		int moduleNumber = 1000;
		int divisionNumber =100;
		int counter = 0;
		
		//while loop to seperate the number each time it loops
		do 
		{
			number = digits % moduleNumber / divisionNumber;
			moduleNumber = moduleNumber /10;
			divisionNumber = divisionNumber /10;
			counter +=1;
			System.out.println(number);
	

		}while (counter < 3);
			
		
		
		

		

	}

}
