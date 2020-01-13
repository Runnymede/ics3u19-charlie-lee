package lee.unit3;
/**
 *<br>A program that incorpates the array to make a guessing game
 *<br>of what animal the player/user is thinking of
 * <br>created on Oct 8th, 2019
 *<br>@author Charlie Lee
 */


import java.util.Scanner;

public class GuessingGame2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Array of different animals 
		String[] animals = {"dog", "horse", "lion","tiger", "monkey", "human", "rhino", "camel"
				,"rat", "cat", "cheeta","wolf","frog","lizard","insect","dolphin","shark"
			   ,"narwhale","seahorse","matt-then", "si-mon", "starfish", "spongebob","crab","squirrel","seagull","eagle", "turtle"};
        
		System.out.println("Animal guessing game! I'm going to guess the animal you are thinking of!");
		
		//loop for changing the animal that is guessed
		for (int giveUp =0; giveUp<20; giveUp++)
		{
			//randomizes the animals
			int turns = (int) (Math.random()*20);
            
			//prints the guess out
			System.out.println("Is it a "+animals[turns]);
			
			//checks if the guessed animal is correct
			String answer = sc.nextLine();
			
			//ends the game if guessed animal is correct
			if (answer.equalsIgnoreCase("yes"))
			{
				System.out.println("Yay I won");
				break;
			}


		}

		
	}

}
