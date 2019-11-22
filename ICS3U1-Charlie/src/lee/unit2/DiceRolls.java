package lee.unit2;
/**
 *<br>A program that incorpates the for loop
 *<br>to make a table of 2 random dices and the sum of each dices added together
 * <br>created on Oct 8th, 2019
 *<br>@author Charlie Lee
 */

public class DiceRolls {

	public static void main(String[] args) {
       
		//Variables
		int total;
        int i;
        
        //The column titles
        System.out.print("Dice1");
        System.out.print(" ");
        System.out.print(" Dice2");
        System.out.print("  ");
        System.out.println("Total");
		
        //looping 5 times
		for (i=1; i<5; i++)
		{
			//first and second column values (diceroll1= first, diceroll2=second)
			int diceroll1 = (int) (Math.random()*6)+1;
			int diceroll2 = (int) (Math.random() *6)+1;
			System.out.print(" "+diceroll1);
			System.out.print("      ");
			System.out.print(diceroll2);
			
	        //Third column
		    total = diceroll1 + diceroll2;
		    System.out.print("     ");
		    System.out.println(total);
			
		}

	}

}
