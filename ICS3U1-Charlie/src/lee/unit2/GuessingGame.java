package lee.unit2;
/**
 *<br>A program that incorpates the if statement and math.random method to
 *<br>create a guessing game (number guessing) between the computer and the player
 * <br>created on Oct 8th, 2019
 *<br>@author Charlie Lee
 */

import java.util.Scanner;
/**
 * A computer vs. player game (guessing number game)
 * created on Oct 23, 2019
 *@author Charlie Lee
 */
public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//prompts the user to guess a number
		System.out.println("Can you guess the number I'm thinking about? Hint: It is between 1 and 20");
		int playerNumber = sc.nextInt();
		
		//secret number generator
		int computerNumber = (int) (Math.random() * 20)+ 1;
		
		
		//Comparing the players number to computers number to see if its the same
		if (playerNumber == computerNumber)
		{
			System.out.println("Computer's number: "+ computerNumber);
			System.out.println("Player's number: "+playerNumber);
			System.out.println("You won!");
		}
		else
		{
			System.out.println("Computer's number: "+computerNumber);
			System.out.println("Player's number: "+playerNumber);
			System.out.println("Better luck next time!");
		}
		
		

	}

}
