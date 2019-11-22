package lee.unit2;
/**
 *<br>A program that incorpates the if statement to
 *<br>ask random math questions of division, multiplication, addition and subtraction
 *<br>and checks if the answer entered by the player is correct
 * <br>created on Oct 8th, 2019
 *<br>@author Charlie Lee
 */

import java.util.Scanner;

public class MathTutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	//Variables and number generators
	int num1 =  (int) (Math.random() * 10)+ 1;
	int num2 =  (int) (Math.random() * 10)+ 1;
	int operator = (int) (Math.random() *4)+ 1;
	double correctanswer;

		
		//The start of the program
		
	    //Multiplication
	    if (operator == 1)
		{
			System.out.println("Welcome to MathTutor!");
			System.out.println("What is " + num1 +"*" +num2);
			correctanswer = num1 * num2;
			double answer = sc.nextInt();
			
			//Compares the computers answer to the players answer and checks if it is the same or not
			if (answer == correctanswer)
			{
				System.out.println("You are correct!");
			}
			else
			{
				System.out.println("You are wrong!");
			}
	
		}
		
		//Division
		else if (operator ==2)
		{
			System.out.println("Welcome to MathTutor!");
			System.out.println("What is " + num1 +"/" +num2);
			correctanswer =num1/num2;
			double answer = sc.nextInt();
			
			//Compares the computers answer to the players answer and checks if it is the same or not
			if (answer == correctanswer)
			{
				System.out.println("You are correct!");
			}
			else
			{
				System.out.println("You are wrong!");
			}
		}
		
		//Subtraction
		else if (operator == 3)
		{
			System.out.println("Welcome to MathTutor!");
			System.out.println("What is " + num1 +"-" +num2);
			correctanswer =num1-num2;
			double answer = sc.nextInt();
			
			//Compares the computers answer to the players answer and checks if it is the same or not
			if (answer == correctanswer)
			{
				System.out.println("You are correct!");
			}
			else
			{
				System.out.println("You are wrong!");
			}
		}
		
		//Addition
		else if (operator ==4)
		{
			System.out.println("Welcome to MathTutor!");
			System.out.println("What is " + num1 +"+" +num2);
			correctanswer = num1+num2;
			double answer = sc.nextInt();
			
			//Compares the computers answer to the players answer and checks if it is the same or not
			if (answer == correctanswer)
			{
				System.out.println("You are correct!");
			}
			else
			{
				System.out.println("You are wrong!");
			}
			
		}

		
	}

}
