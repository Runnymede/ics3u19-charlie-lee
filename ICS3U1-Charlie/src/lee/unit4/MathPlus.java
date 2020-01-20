package lee.unit4;
/**
 *<br>A program that incorpates the methods for calculating different math related questions
 * <br>created on Dec 18th, 2019
 *<br>@author Charlie Lee
 */

import java.util.Arrays;
import java.util.Scanner;

public class MathPlus {
	public static int min(int num[])
	{
		//Variables
		int smallest =0;
		
	//For loop starts at 0 and ends when it checks all the numbers
	for (int start=0; start<num.length; start++)
	{
       
	//Checks if the first number is smaller than the second number (continues till the end of the array)
	 if (num[start]<num[smallest])
	 {
		smallest = start;
	 }
	}
	
	//Returns the index of the minimum number
	return smallest;
	}
	
	public static int max(int num[])
	{
		//Variables
		int biggest=0;
		
	//For loop starts at 0 and ends when it checks all the numbers
	for (int start=0; start<num.length; start++)
	{
       
	//Checks if the first number is bigger than the second number (continues till the end of the array)
	 if (num[start]>num[biggest])
	 {
		biggest = start;
	 }
	}
	
	//returns the index of the largest number
	return biggest;
	}
	
	public static int sum(int num[])
	{
		//Variables
		 int sum =0;
		 
		//For loop starts at 0 and ends when it checks all the numbers 
		//This continuously adds each of the numbers by adding the newest number to the last total sum.
		for(int start =0; start<num.length; start++)
		{
		 sum = num[start] +sum;
		}
		//Returns the total sum of all the arrays added together
		return sum;
	}
	public static double average(double[] num)
	{
		//Variables
		double sum = 0;
		
		//For loop starts at 0 and ends when it checks all the numbers 
		//This for loop calculates the sum of all the numbers combined (Used in the average formula)
		for(int start =0; start<num.length; start++)
		{
		 sum = num[start] +sum;
		}
		//The average is calculated from the total sum of all the numbers divided by the amount of numbers there are.
		double totalaverage = sum/num.length;
		
		//Returns the average.
		return totalaverage;
		
	}
	public static double median(double[] num)
	{
		//Sorts the array from least to greatest number
		Arrays.sort(num);
        
		//Checks if the length of the array is an even or a odd number.
		//If it is a odd number there is only 1 median
		if (num.length%2 != 0)
		{
			int index = num.length/2;
			double number = num[index];
			return number;
		}
		//If it is a even number there are 2 medians which are then used to calculate the average between them.
		else
		{
         
			
			int index = num.length/2;
			  int index2 = num.length/2 +1;
			  double number = num[index];
			  double number2 = num[index2];
			  double median = ((number + number2)/2) -1;
			  return median;
		}
	}
	public static double mode(double[] num)
	{
		double biggest = 0;
	for (int i = 0; i<num.length; i++)
	{
		int oldCounter = 0;
		for (int j = 1; j<i; j++)
		{
			if (num[i]==num[j])
			{
				oldCounter++;
				biggest = num[i];
				int newCounter = oldCounter;
			}
			int newCounter = oldCounter;
			if (oldCounter>newCounter)
			{
				biggest = num[i];
			}
		}
		
	}
	return biggest;
	

	}

	public static boolean prime(int x)
	{
		x = x%2;
		if (x == 0)
		{
			return false;
		}
		else if(x==2)
		{
			return true;
		}
		else if (x==1)
		{
			return false;
		}
		else if (x!=0)
		{
			return true;
		}
		return true;

	}
	public static long factorial(int num)
	{
		long nextPoint = num;
		for (int startPoint =num-1; startPoint>1; startPoint--)
		{
		
		     nextPoint = startPoint*nextPoint;
			
		}
		return nextPoint;
		
	}
	public static int numOfFactors(int num)
	{
		int counter = 0;
		double limit = num/2;
		double limitRound =  Math.rint(limit);
		for (int i = 1; i<=limitRound; i++)
		{
			double check =num%i;
			if (check==0)
			{
				counter++;
			}
		}
		return counter;
		
	}
	public static int[] factors (int num)
	{
		int counter =0;
		 int counter2 = 0;
		int limit = num/2;
		int limitRound = (int) Math.rint(limit);
		for (int i = 1; i<=limitRound; i++)
		{
			double check =num%i;
			if (check==0)
			{
				counter++;
			}
		}
		
		int[] x = new int[counter];
		
		for (int b=1; b<=limitRound; b++)
		{
			double check = num%b;
			if (check==0)
			{
			  x[counter2] =b;
			  counter2++;
			}
		}
		return x;
		
	}




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many integers will you list?");
		int amount = sc.nextInt();
		int[] x = new int[amount];
		double[] x2 = new double[amount];
		System.out.println("Please list your integers");
		for (int totalLoop=0; totalLoop<amount; totalLoop++)
		{
		      x[totalLoop] = sc.nextInt();
		      x2[totalLoop] = x[totalLoop];
		}
		
		
		int answer =min(x);
		System.out.println("The minimum is "+answer);
		int answer2 = max(x);
		System.out.println("The maximum is "+answer2);
		int answer3 = sum(x);
		System.out.println("The sum is "+answer3);
	    double answer4 = average(x2);
	    System.out.println("The average is "+answer4);
	    double answer5 = median(x2);
	    System.out.println("The median is "+answer5);
	    double answer6 = mode(x2);
	    System.out.println("The mode is "+answer6);
	    System.out.println("Please input a number to check if it is prime or not");
	    int x3 = sc.nextInt();
	    boolean answer7 = prime(x3);
	    System.out.println(answer7);
	    System.out.println("Please enter a number to get the factorial number");
	    int x4 = sc.nextInt();
	    long answer8 = factorial(x4);
	    System.out.println("The factorial number is "+answer8);
	    System.out.println("Please enter a number to get the amount of factors there are and a list of them");
	    int x5 = sc.nextInt();
	    int answer9 = numOfFactors(x5);
	    System.out.println("There are "+answer9+" factors.");
	    int[] answer10 = factors(x5);
	    System.out.println("List of factors:");
	    for(int i = 0; i<answer10.length; i++)
	    {
	    	System.out.println(answer10[i]);
	    }
	    

		
		

	}

}
