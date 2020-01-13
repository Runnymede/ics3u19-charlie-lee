package lee.unit3;
/**
 *<br>A program that incorpates the array to store names
 *<br>and repeat the names that the player input and repeat the names again
 *<br>but in opposite order
 * <br>created on Oct 8th, 2019
 *<br>@author Charlie Lee
 */


import java.util.Scanner;

public class NameList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
	    //prompts user to input the amount of names that will be stored
		System.out.println("Enter the amount of names you will input");
		int namesAmount = sc.nextInt();
		
		//creates a total amount of arrays based on players input
		String[] x = new String[namesAmount];
		int helloAmount = namesAmount;
  

		//asks user to input the names
		System.out.println("Enter the list of names");
		for (int totalLoop=0; totalLoop<namesAmount; totalLoop++)
		{
		      x[totalLoop] = sc.next();
		}
		
		//prints it again in the same order
		for (int totalLoop=0; totalLoop<namesAmount; totalLoop++)
		{
			System.out.println(x[totalLoop]);
		}
		
		//prints it in opposite order
		for (int totalLoop=helloAmount; totalLoop>=0 ; totalLoop--)
		{
			System.out.println(x[totalLoop-1]);
		}
		
		
		


	}

}
