package FinalProject;
/**
 *<br>--Final Project--
 *<br>A program that entertains 2 players with a game called Yahtzee.
 *<br>created on Jan 20th, 2020
 *<br>@author Charlie Lee
 */

import java.util.ArrayList;
import java.util.Scanner;

public class yahtzee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Variables
		int[] keptArray = new int [5];
		int[]keptArray2 = new int [5];
		int[] pointsArray = new int [6];
		int[] pointsArray2 = new int[6];
		int numOfRolls = 5;
		int counter = 0;
		int chances = 0;
		int spaceLeft;
		int sizeOfAL =0;

		//Introduction: (The how to's and explaination of the game)
		System.out.println("Welcome to Yahtzee!");
		System.out.println("How To's:");
		System.out.println("Yahtzee is a dice based game where you score points by getting the same number on the dices face");
		System.out.println("Each of the same dices are then added up and put into a category of your choosing (there are up to 6 categories)");
		System.out.println("The 6 categories represent each number on the dice's face (e.g. 1,2,3,4..6)");
		System.out.println("The goal is to get more points for each category than the other player!");
		System.out.println("Keep in mind that only the same number as the category you chose are converted into points!");
		
		System.out.println("Keep in mind that when choosing indexes (dice rolls) it starts at 0!");
		System.out.println("Press any key to begin");
		String click = sc.nextLine();

		//Main Body: Game lasts for 10 rounds (5 for each player)
		for (int player = 1; player<=10; player++)
		{
			System.out.println();
			//Variables
			int checkPlayer = player%2;
			chances =0;
			numOfRolls = 5;
			counter = 0;

			//This if statement is checking if the current player is 1 
			//(this is checked by checking if the number of variable player is an even or odd number)
			//Player 1 is odd, Player 2 is even
			if (checkPlayer>0)
			{
				System.out.println("Player 1's turn"); 

				//This loops of up to 3 times (Since each player is given 3 chances to reroll per turn)
				for (int c=1; c<5; c++)
				{
					//Arraylist: This is a short term storage to keep the rolls in.
					ArrayList<Integer>dice =rolls(numOfRolls);

					//This is checking if the player has enough chances to reroll
					//If the player does not have enough, they are given a choice of category to store
					//their number in as well as a scoreboard that shows player 1's and 2's points.
					if (chances!=3)
					{
						rolls(numOfRolls);
						System.out.print("Dice Rolls: ");
						displayRolls(dice);
						chances++;
						System.out.println("**Dice rolls start at index 0!**");
					}
					else
					{
						System.out.println("What number category would you like to convert into points? (In Dice Rolls not Kept Dices)");
						int category = sc.nextInt();

						//calculatePoints method calculates the points for the specific category
						//the player chooses.
						int totalPoints = calculatePoints(keptArray,category);
						//Prints out the players points in chosen category
						System.out.println("You have "+totalPoints+" points in category "+category);
						System.out.println();

						//Stores the points into a new array to print out in the leaderboard.
						//The scoreboard is given player 1's point and players 2's point, and is
						//then printed out.
						pointsArray[category-1] = totalPoints;
						scoreboard(pointsArray,pointsArray2);
						//We then reset the the kept dices for the players 2nd round and so on.
						for (int i = 0; i<keptArray.length; i++)
						{
							keptArray[i] =0;
						}
						break;
					}

					//This is where the player enters indexes continously (represents the dice roll)
					//to keep until 7 is  entered (the stop signal for when they are finished).
					System.out.println("What indexes do you want to keep, please enter 7 to stop");
					for (int i = 0; i<=4; i++)
					{
						int index = sc.nextInt();
						if (index==7)
						{
							break;
						}
						else
						{
							keptArray[counter]= dice.get(index);
							counter++;
						}
					}
					//Everytime, they are given new dice rolls, they are also given their kept dices
					//so that they can see what they are trying to achieve/to make it convient for
					//the player.
					//Below is a loop to print out all the kept dices.
					System.out.print("Kept Dices: ");
					for (int b2 = 0; b2<counter; b2++)
					{
						System.out.print("["+keptArray[b2]+"]");

					}
					System.out.println();
					//This is used to make sure the total amount of dices are 5.
					//e.g. If you have 3 kept dices in keptArray, then you can only roll 2 more dices.
					numOfRolls = 5 - counter;
					dice.clear();

				}

			}
			//Again, this else if statement is used to check for the players turn,
			//Player 1 is odd number, Player 2 is even number.
			else if(checkPlayer==0)
			{
				//Down below is basically a repeat of player 1's main body, except different arrays
				//are used to have different storages for each player.
				System.out.println("Player 2's turn");
				for (int b=1; b<6; b++)
				{
					ArrayList<Integer>dice =rolls(numOfRolls);
					if (chances!=3)
					{
						//random dice roll generator
						rolls(numOfRolls);
						System.out.print("Dice Rolls: ");
						//displays the rolls from the random dice roll generator
						displayRolls(dice);
						chances++;
					}
					else
					{
						System.out.println("What number category would you like to convert into points?");
						int category = sc.nextInt();
						int totalPoints = calculatePoints(keptArray2,category);
						System.out.println("You have "+totalPoints+" points in category "+category);
						System.out.println();
						//Player 2's array for the scoreboard.
						pointsArray2[category-1] = totalPoints;
						scoreboard(pointsArray,pointsArray2);
						//Erases the kept dices for next round
						for (int i = 0; i<keptArray2.length; i++)
						{
							keptArray2[i] =0;
						}
						break;
					}

					System.out.println("What indexes do you want to keep, please enter 7 to stop");
					for (int i = 0; i<=4; i++)
					{
						int index = sc.nextInt();
						if (index==7)
						{
							break;
						}
						else
						{
							keptArray2[counter]= dice.get(index);
							counter++;
						}
					}
					//Prints out the kept dices stored in the keptArray2 array.
					System.out.print("Kept Dices: ");
					for (int b2 = 0; b2<counter; b2++)
					{
						System.out.print("["+keptArray2[b2]+"]");

					}
					System.out.println();
					numOfRolls = 5 - counter;
					//This clears the arraylist so that new dice rolls can be generated.
					dice.clear();

				}
			}
		}
		//END: (displays who won)
		//After all the rounds are finished (5 each player, a total of 10 rounds)
		//The method will use the array storage for points (pointsArray and pointsArray2) and display who won.
		playerWin(pointsArray,pointsArray2);
	}


	//Method used to generate random dice rolls (up to 5)
	public static ArrayList<Integer> rolls(int n)
	{
		ArrayList<Integer> dice = new ArrayList<Integer>();
		for (int i=1; i<=n; i++) 
		{
			int roll = (int) (Math.random()*6)+1;
			dice.add(roll); 
		}
		return dice;

	}
	//Method used to display the rolls generated from method roll.
	public static void displayRolls (ArrayList<Integer> dice)
	{
		for (int i=0; i<dice.size(); i++)
		{
			System.out.print("["+dice.get(i)+"]");
		}
		System.out.println();
	}
	//Method used to calculate the total amount of points from the kept dices.
	public static int calculatePoints (int[]arrayP1, int category)
	{
		int counter = 0;
		for (int i = 0; i<arrayP1.length; i++)
		{
			if (arrayP1[i]==category)
			{
				counter++;
			}

		}
		int points = category*counter;

		return points;

	}
	//Method to display the scoreboard with the players points
	public static void scoreboard (int[]pointsArray, int[]pointsArray2)
	{
		System.out.print("   Player 1  ");
		System.out.println("Player 2");
		for (int i = 0; i<pointsArray.length; i++)
		{
			int category = i+1;
			System.out.print(category+":    ");
			System.out.format("%-10s", pointsArray[i]);
			System.out.format("%-6s", pointsArray2[i]);
			System.out.println();
		}
	}

	//Method to check who won and display who won.
	public static void playerWin (int[]pointsArray, int[]pointsArray2)
	{
		//variables (each sum is for each independent player)
		int sum = 0;
		int sum2 = 0;

		//These 2 for loops below, are what calculates the total amount of points at the end of the game
		for(int i = 0; i<pointsArray.length; i++)
		{
			int num = pointsArray[i];
			sum = sum+num;
		}
		for(int i = 0; i<pointsArray2.length; i++)
		{
			int num = pointsArray2[i];
			sum2 = sum2+num;
		}

		//This is used to display the outcome of the game (e.g. Which player won? player 1 or player 2?
		//did they tie?)
		if (sum>sum2)
		{
			System.out.println("Player 1 has won!");
		}
		else if (sum2>sum)
		{
			System.out.println("Player 2 has won!");
		}
		else if (sum==sum2)
		{
			System.out.println("Player 1 and Player 2 has tied!");
		}

	}

}