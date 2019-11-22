package lee.unit2;
/**
 *<br>A program that incorpates the for loop to add the cubes
 *<br> of each digit to make a total sum
 * <br>created on Oct 8th, 2019
 *<br>@author Charlie Lee
 */

import java.util.Scanner;

public class CubesSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//prompts user for a number
		System.out.println("Enter a positive integer");
		int digits = sc.nextInt();

		//Variables
		int number;
		int moduleNumber = 1000;
		int divisionNumber =100;
		int sum = 0;
		int counter = 0;

		
        //Looping 3 times for the total 
		do 
		{
			number = digits % moduleNumber / divisionNumber;
			moduleNumber = moduleNumber /10;
			divisionNumber = divisionNumber /10;
			counter +=1;
			number = (int)Math.pow(number, 3);
			sum = sum + number;
	

		}while (counter < 3);
		
		//Output
		System.out.println(sum);


}
}