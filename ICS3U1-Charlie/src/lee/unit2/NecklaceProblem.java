package lee.unit2;
/**
 
* <br> A program that incorporates a do while loop to
* <br> create a necklace made out of numbers with a starting 
* <br>and ending point of the same numbers entered
 * <br>created on Nov. 8, 2019
 *<br>@author Charlie Lee
 */

import java.util.Scanner;

public class NecklaceProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//prompts the user for the first two numbers to create a necklace
		System.out.println("Enter your first number");
		int chosenNumber = sc.nextInt();
		System.out.println("Enter your second number");
		int chosenNumber2 = sc.nextInt();
		
		//variables
		int num1= chosenNumber;
		int num2 = chosenNumber2;
		int sum;
		boolean loop = true;
		
		//prints the numbers that the user entered (chosenNumber and chosenNumber2)
		System.out.println(num1);
		System.out.println(num2);
		
		//while loop to loop the addition of the users first number and second number
		do
		{
	
			sum= num2 + num1;
			
			//module to create a value in the tens value
			sum = sum %10;
			System.out.println(sum);
	        
			//reassigning the values in order to keep a cycle of the necklace
			//e.g. num1=1 num2=8 sum=9, therefore num1=8 num2=9
			num1=num2;
	        num2=sum;
	        
	        //the section to stop the while loop to end the necklace
	        //Stops when the original input is the current input
	        //e.g. if original input = 1 and 8 the necklace ends when the sum= 8 and num1 = 1
			if(num1==chosenNumber&& sum ==chosenNumber2)
			{
				//this allows the loop to stop since the loops only goes on while the variable loop is true
				loop = false;
			}
		}while (loop==true);
	}

}
