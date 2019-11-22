package lee.unit2;
/**
 *<br>A program that incorpates the if statement/else if statement to
 *<br>print the total price of the copies based on the amount of copies
 *<br>you will buy
 * <br>created on Oct 8th, 2019
 *<br>@author Charlie Lee
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class PrintingPrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//0 - 99 $0.30 per copy
		//100 - 499 $0.28 per copy
		//500 - 749 $0.27 per copy
		//750 - 1000 $0.26 per copy
		//over 1000 $0.25 per copy
		
		//Below are the variables
		
		//The format
		DecimalFormat price = new DecimalFormat ("$###0.00");
		double calculate;
		
		//Below is the main program for the Copies Prices Program
		
		//prompts the user for the amount of copies they wish to buy
		System.out.println("Enter the amount of copies you wish to buy");
		int copies = sc.nextInt();
		
		//Checks the amount of copies and bases the price off of that
		if (copies <= 99) {
			calculate = copies * 0.30;
			System.out.println("Your rate is $0.30 per copy");
			System.out.println("Your total amount is "+ price.format(calculate));
		}
		else if (copies <= 499) {
			calculate = copies * 0.28;
			System.out.println("Your rate is $0.28 per copy");
			System.out.println("Your total amount is "+ price.format(calculate));
		}
		else if (copies <= 749) {
			calculate = copies * 0.27;
			System.out.println("Your rate is $0.27 per copy");
			System.out.println("Your total amount is "+ price.format(calculate));
		}
		else if (copies <= 1000) {
			calculate = copies * 0.26;
			System.out.println("Your rate is $0.26 per copy");
			System.out.println("Your total amount is "+ price.format(calculate));
		}
		else if (copies >1000) {
			calculate = copies * 0.25;
			System.out.println("Your rate is 0.25");
			System.out.println("Your total amount is "+ price.format(calculate));
		}

	}

}
