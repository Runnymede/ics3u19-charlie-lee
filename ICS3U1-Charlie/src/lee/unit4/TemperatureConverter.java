package lee.unit4;

import java.util.Scanner;

public class TemperatureConverter {
     
	public static void fahrenheitToCelsius(double temp)
	{
		double ftoc =(temp - 32) * 5 / 9;
		System.out.print("Celcius: "+ftoc);
	}
	public static void celsiusToFahrenheit(double temp2)
	{
		double ctof = temp2 * 9 / 5 + 32;
		System.out.print("Fahrenheit: "+ctof);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to convert from fahrenheit to celsius(ftoc) or celisus to Fahrenheit(ctof)?");
        String answer = sc.nextLine();
		
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
