package lee.unit2;
/**
 *<br>A program that incorpates the while loop and if statement to
 *<br>print all the even numbers between 1-100
 * <br>created on Oct 8th, 2019
 *<br>@author Charlie Lee
 */
public class EvenNumbers {

	public static void main(String[] args) {
		
		//Variables
		int value = 1;
		int check;
		int counter =0;
		
		while (value<=100)
		{
			//Checking if the value is divisble by 2 (making it even)
			check = value %2;
			
			//Printing the numbers that are even based on the 'check' variable above
			if (check==0)
			{
				counter +=1;
				System.out.println(value);
			}
			
			//Adds a value to 1 to check every number from 1 to 100
			value +=1;		
					
		}
		
		//Tells the amount of numbers that are even ranging from 1-100.
		System.out.println("There are "+counter+" numbers that are even between 1 and 100");
		

	}

}
