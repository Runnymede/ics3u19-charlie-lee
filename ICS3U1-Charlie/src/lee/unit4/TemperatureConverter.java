package lee.unit4;
/**
 *<br>A program that converts fahreinheit to celcius and vice versa
 * <br>created on Dec.18th, 2019
 *<br>@author Charlie Lee
 */

import java.util.Scanner;

public class TemperatureConverter {

	//This method converts fahrenheit to celsius
	public static void fahrenheitToCelsius(double temp)
	{
		double ftoc =(temp - 32) * 5 / 9;
		System.out.print("Celcius: "+ftoc);
	}
	
	//This method converts celsius to fahrenheit
	public static void celsiusToFahrenheit(double temp2)
	{
		double ctof = temp2 * 9 / 5 + 32;
		System.out.print("Fahrenheit: "+ctof);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Asks user which conversion type they want
		System.out.println("Would you like to convert from fahrenheit to celsius(ftoc) or celisus to Fahrenheit(ctof)?");
		String answer = sc.nextLine();
        
		
		//Depending on the answer a method will be chosen and the user will
		//be asked what the number they wish to convert is.
		if (answer.equalsIgnoreCase("ftoc"))
		{
			System.out.println("What is the fahrenheit?");
			double fahrenheit = sc.nextInt();
			fahrenheitToCelsius(fahrenheit);
		}
		else if(answer.equalsIgnoreCase("ctof"))
		{
			System.out.println("What is the celisus?");
			double celisus = sc.nextInt();
			celsiusToFahrenheit(celisus);
		}
	}

}
