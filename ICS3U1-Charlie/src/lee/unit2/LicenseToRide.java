package lee.unit2;
/**
 *<br>A program that incorpates the for while loop to
 *<br>print the probability of the license plating numbers
 *<br> that when seperated is equal to or greater than the sum of 34
 * <br>created on Oct 8th, 2019
 *<br>@author Charlie Lee
 */

public class LicenseToRide {

	public static void main(String[] args) {
	
		//Variables
        double counter =0;
        double probability;
		
		for (int num=9999; num>=0; num--)
		{
		  //The number seperator
		  int ones = num%10;
		  int tens = num/10%10;
		  int hundreds = num/100%10;
		  int thousands = num/1000%10;
		  
		  //Getting the sum of all the numbers
		  int total = ones + tens + hundreds+thousands;
          
		  //checking if the total sum is greater than or equal to 34 (if true +1 to counter)
          if(total>=34)
          {
        	  counter+=1;
          }
		}
		
		//Probability calculator
		probability = (counter/10000)*100;
		
		//output
		System.out.println("There are "+counter+" numbers that are greater than or equal to 34");
		System.out.println("The probability of the license plate being greater than or equal to 34 is "+probability+"%");
         
	}

}
