package lee.unit2;
/**
 *<br>A program that incorpates the if statement
 *<br>to check if the requirements of a package delivery are met
 * <br>created on Oct 8th, 2019
 *<br>@author Charlie Lee
 */

import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Cannot be more than 27kg or larger than 0.1 cubic meters (100,000 cubic centimeters).
		//Output should be:
		//Too heavy.
		//Too large.
		//Too heavy and too large.
		//Accepted
		
		//prompts the user for the mass of the package
		System.out.println("How many kilograms is your package/devlivery");
	    double kilograms = sc.nextDouble();
	    
	    //prompts the user for the length of the package
	    System.out.println("What is the length of your package (centimeters) ");
	    double length = sc.nextDouble();
	    
	    //prompts the user for the width of the package
	    System.out.println("What is the width of your package (centimeters");
	    double width = sc.nextDouble();
	    
	    //prompts the user for the height of the package 
	    System.out.println("What is the height of your package (centimeters");
	    double height = sc.nextDouble();
	    
	    //Formula to calculate the size of the package
	    double size = length * width * height;
	    
	    
	    //Checks if the users package has the right requirements for shipping
	    if (kilograms <= 27 && size <=100000)
	    {
	    	System.out.println("Accepted.");
	    }
	    else if (kilograms >= 27 && size >100000) 
	    {
	    	System.out.println("Too heavy and too large, sorry we cant accept this.");
	    }
	    else if (kilograms <= 27 && size >100000 )
	    {
	    	System.out.println("Too large, please decrease your packages size");
	    }
	    else if (kilograms >27 && size <=100000)
	    {
	    	System.out.println("Too heavy, please take out some objects out of your package");
	    }
		

	}

}
