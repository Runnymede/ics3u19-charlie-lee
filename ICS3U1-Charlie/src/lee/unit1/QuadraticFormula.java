package lee.unit1;

import java.util.Scanner;
/**
 * A program that finds the quadratic roots (x value)
 * created on Sept 23, 2019
 *@author Charlie Lee
 */
public class QuadraticFormula {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//* Scanning per value (a b and c) Added the quadratic format
		System.out.println("The format for a quadratic is ax^2 + bx^2 + c");
		System.out.println("Enter the value for a");
	    double a = sc.nextDouble();
		System.out.println("Enter the value for b");
		double b = sc.nextDouble();
		System.out.println("Enter the value for c");
		double c = sc.nextDouble();
		
		//Below is the program for the first x value
		double q;
		q = (-b +Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
		System.out.println("The value of x is"+ q);
	    
		//Below is the program for the second x value
		double qtwo;
	    qtwo = (-b -Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
	    System.out.println("The other value of x is "+ qtwo);
	   
		
		
		

	}

}
