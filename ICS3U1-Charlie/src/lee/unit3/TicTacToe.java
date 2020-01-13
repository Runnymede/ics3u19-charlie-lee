package lee.unit3;
/**
 *<br>A program that incorpates the array to make a
 *<br>tic tac toe game for two players (X and O)
 * <br>created on Oct 8th, 2019
 *<br>@author Charlie Lee
 */


import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Creates tic tac toe board of storage
		char[][] tttboard = new char [3][3];
		
		//Loop for asking the row and column till one player wins (X or O)
		for (int answers=0; answers <6; answers++)
		{
			//prompts user for the X placement
			System.out.println("Enter the row");
			int row2 = sc.nextInt();
			
			System.out.println("Enter the column");
			int col2 = sc.nextInt();
			
			//Sets the first player to X
			 tttboard[row2][col2]= 'X';
			 
			 //Checks if X won
			 if (tttboard[1][0]=='X' && tttboard[1][1]=='X' && tttboard[1][2]=='X')
				{
					System.out.println("X wins!");
					break;
				}
				else if(tttboard[2][0]=='X' && tttboard[2][1]=='X' && tttboard[2][2]=='X')
				{
					System.out.println("X wins!");
					break;
				}
				else if (tttboard[0][0]=='X' && tttboard[0][1]=='X' && tttboard[0][2]=='X')
				{
					System.out.println("X wins!");
					break;
				}
				else if(tttboard[0][0]=='X' && tttboard[1][1]=='X' && tttboard[2][2]=='X')
				{
					System.out.println("X wins!");
					break;
				}
				else if (tttboard[0][1]=='X' && tttboard[1][1]=='X' && tttboard[2][1]=='X')
				{
					System.out.println("X wins!");
					break;
				}
				else if (tttboard[0][0]=='X' && tttboard[1][0]=='X' && tttboard[2][0]=='X')
				{
					System.out.println("X wins!");
					break;
				}
				else if (tttboard[0][2]=='X' && tttboard[1][2]=='X' && tttboard[2][2]=='X')
				{
					System.out.println("X wins!");
					break;
				}
			
			 //Creates the outline of the board
			for (int row=0; row <tttboard[0].length; row++)
			{
				for (int col= 0; col <tttboard[0].length; col++)
				{
                	  System.out.print(tttboard[row][col]+"|");
                	 
                }
				System.out.println();
				System.out.println("------");

				
			}
		    
			//prompts user for the O placement
			System.out.println("Enter the row");
			int row3 = sc.nextInt();
			
			System.out.println("Enter the column");
		    int col3 = sc.nextInt();
			
		    //Sets player 2 as O
              tttboard[row3][col3]= 'O';
			 
              //Creates outline for board
			 for (int row=0; row <tttboard[0].length; row++)
				{

					for (int col= 0; col <tttboard[0].length; col++)
					{
	                	 System.out.print(tttboard[row][col]+"|");
	                	 
	                 }
					System.out.println();
					System.out.println("------");
				}
			    
			    //Checks if O won
				if (tttboard[1][0]=='O' && tttboard[1][1]=='O' && tttboard[1][2]=='O')
				{
					System.out.println("O wins!");
					break;
				}
				else if(tttboard[2][0]=='O' && tttboard[2][1]=='O' && tttboard[2][2]=='O')
				{
					System.out.println("O wins!");
					break;
				}
				else if (tttboard[0][0]=='O' && tttboard[0][1]=='O' && tttboard[0][2]=='O')
				{
					System.out.println("O wins!");
					break;
				}
				else if(tttboard[0][0]=='O' && tttboard[1][1]=='O' && tttboard[2][2]=='O')
				{
					System.out.println("O wins!");
					break;
				}
				else if (tttboard[0][1]=='O' && tttboard[1][1]=='O' && tttboard[2][1]=='O')
				{
					System.out.println("O wins!");
					break;
				}
				else if (tttboard[0][0]=='O' && tttboard[1][0]=='O' && tttboard[2][0]=='O')
				{
					System.out.println("O wins!");
					break;
				}
				else if (tttboard[0][2]=='O' && tttboard[1][2]=='O' && tttboard[2][2]=='O')
				{
					System.out.println("O wins!");
					break;
				}
				
	              
			}

		
	                 
			 
			 
	
		
	        
	        
		}

        

		

	}

