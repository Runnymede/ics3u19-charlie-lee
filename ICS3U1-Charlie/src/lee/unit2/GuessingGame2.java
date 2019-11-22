package lee.unit2;
/**
 *<br>A program that incorpates the do while loop and math.random to
 *<br>make a continous guessing game until the player makes a correct guess
 * <br>created on Oct 8th, 2019
 *<br>@author Charlie Lee
 */

import java.util.Scanner;

public class GuessingGame2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        //variables
		int computerNumber;
		int playerNumber;
		
		//prompts the user to guess a number
		System.out.println("Can you guess the number I'm thinking about? Hint: It is between 1 and 20");
	     playerNumber =sc.nextInt();
		
        //This loop section is the part where it asks the player to try again till they get it right
		do 
		{
			System.out.println("Try again");
			playerNumber =sc.nextInt();
			computerNumber = (int) (Math.random() * 20)+ 1;
			
		 } while (playerNumber != computerNumber );
		
		//The output if you win
		System.out.println("Computer's number: "+ computerNumber);
		System.out.println("Player's number: "+playerNumber);
		System.out.println("You won!");
		
		
		
	}

}
