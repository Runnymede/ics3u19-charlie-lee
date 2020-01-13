package lee.unit4;

import java.util.Arrays;
import java.util.Scanner;

public class MathPlus {
	public static int min(int num[])
	{
		int smallest =0;
	for (int start=0; start<num.length; start++)
	{
       
	 if (num[start]<num[smallest])
	 {
		smallest = start;
	 }
	}
	
	return smallest;
	}
	
	public static int max(int num[])
	{
		int smallest =0;
	for (int start=0; start<num.length; start++)
	{
       
	 if (num[start]>num[smallest])
	 {
		smallest = start;
	 }
	}
	
	return smallest;
	}
	
	public static int sum(int num[])
	{
		
		 int sum =0;
		for(int start =0; start<num.length; start++)
		{
		 sum = num[start] +sum;
		}
		return sum;
	}
	public static double average(double[] num)
	{
		double sum = 0;
		for(int start =0; start<num.length; start++)
		{
		 sum = num[start] +sum;
		}
		double totalaverage = sum/num.length;
		return totalaverage;
		
	}
	public static double median(double[] num)
	{
		Arrays.sort(num);
        
		if (num.length%2 != 0)
		{
			int index = num.length/2;
			double number = num[index];
			return number;
		}
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
		else if (x==0)
		{
			return false;
		}
		return true;

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
		System.out.println(answer);
		int answer2 = max(x);
		System.out.println(answer2);
		int answer3 = sum(x);
		System.out.println(answer3);
	    double answer4 = average(x2);
	    System.out.println(answer4);
	    double answer5 = median(x2);
	    System.out.println(answer5);
	    double answer6 = mode(x2);
	    System.out.println(answer6);
	    System.out.println("Please input a number to check if it is prime or not");
	    int x3 = sc.nextInt();
	    boolean answer7 = prime(x3);
	    System.out.println(answer7);

		
		

	}

}
