package lee.unit1;

import java.util.Scanner;

/**
 * System Input Assignment
 * created on Sept 23, 2019
 *@author Charlie Lee
 */
public class ObjectHeight {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		
		//Scanner scans for a answer and then can be used in a equation
		//Scanner spawns with Ctrl + Shift + O
		//Add Scanner sc = new Scanner(System.in) to spawn a Scanner
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a time less than 4.5 seconds");
		
		//variables/scan/formulas below
		double t = sc.nextDouble();
		double h;
		h = 100 - 2.9 * t * 2;
		
		System.out.println("The height of the object is "+ h);
		

	}

}
