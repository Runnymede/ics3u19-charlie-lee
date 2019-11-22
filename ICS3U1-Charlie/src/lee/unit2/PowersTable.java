package lee.unit2;
/**
 *<br>A program that incorpates the for loop and the while loop to
 *<br>make a table of powers created based on the highest number
 *<br> for the base and exponent entered by the user
 * <br>created on Oct 8th, 2019
 *<br>@author Charlie Lee
 */

import java.util.Scanner;

public class PowersTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Variables
		int counterLimited =1;
		int counterLimited2 =1;
		int counter=1;
		int counter2=1;
		int base=1;
		int exponet=1;
		int base2=1;
		
		//loop for the title of table (Assigned values e.g. output = X^1,2,3,4)
		while (counterLimited <=5)
		{
			 System.out.format("%-10s","x^"+counterLimited);
			 System.out.print(" ");
			 counterLimited++;
		}
       
		
		//loop for the values of the exponets
       for (counterLimited2=1; counterLimited2 <=6; counterLimited2++)
       {
    	   System.out.println();
           for (exponet=1; exponet<=5; exponet++)
           {
             //format for the values
             System.out.format("%-10s",(int)Math.pow(base, exponet));
             System.out.print(" ");
            
            //A way out of the loop of the nested for loop
            if(exponet==5) 
            {
             System.out.println();
             base+=1;
             break;
            }
           }
           
           //Resetting for next set of values
           exponet =exponet-5;
           System.out.println();
           
       }
		
		System.out.println("Enter the highest number for a exponet");
		int chosenExponet = sc.nextInt();
		
		System.out.println("Enter the highest number for a base");
		int chosenBase = sc.nextInt();
		

		//Loop for the organization of the first row (Assigned values e.g. output = X^1,2,3,4)
		while (counter2 <=chosenExponet)
		{
			 System.out.format("%-10s","x^"+counter2);
			 System.out.print(" ");
			 counter2 +=1;
		}
       
		
		//loop for the values of the exponets
       for ( int counter3=1; counter3 <=chosenBase; counter3++)
       {
    	   System.out.println();
           for (exponet=1; exponet<=chosenExponet; exponet++)
           {
             //format for the values
             System.out.format("%-10s",(int)Math.pow(base2, exponet));
             System.out.print(" ");
            
            //A way out of the loop of the nested for loop
            if(exponet==chosenExponet) 
            {
             System.out.println();
             base2+=1;
             break;
            }
           }
           
           //Resetting for next set of values
           exponet =exponet-chosenExponet;
           System.out.println();
           
       }



}
}
