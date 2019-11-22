package lee.unit2;
/**
 *<br>A program that incorpates the do while loop to
 *<br>seperate the digits and add them up to create a sum and print it
 * <br>created on Oct 8th, 2019
 *<br>@author Charlie Lee
 */

import java.util.Scanner;

public class DigitsSum {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//prompts the user for a positive integer
	System.out.println("Enter a positive integer");
	int digits = sc.nextInt();
    
	//variables
	int number;
	int moduleNumber = 1000;
	int divisionNumber =100;
    int sum = 0;
	int counter = 0;
	
	
	//do while loop in order to add the number each time to the sum and in the end displays the added sum
	do 
	{
		number = digits % moduleNumber / divisionNumber;
		moduleNumber = moduleNumber /10;
		divisionNumber = divisionNumber /10;
		counter +=1;
		sum = sum + number;
	
	}while (counter < 3);
	
	//Output
	System.out.println(sum);
	
}
}
