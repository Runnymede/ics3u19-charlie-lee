package lee.unit2;
/**
 *<br>A program that incorpates the Thread.sleep(waiting) and the for loop
 *<br>to make a countdown starting from 10 and down to 1
 * <br>created on Oct 8th, 2019
 *<br>@author Charlie Lee
 */


public class BlastOff {

	public static void main(String[] args) throws InterruptedException {
       
		//Variables
       int value;
       
       //Starting output
       System.out.println("We have lift off in...");
       
       //Loop for the countdown
       for (value =10; value>=1; value--)
       {
    	   System.out.println(value);
    	   
    	   //Waits for 1000 miliseconds
    	   Thread.sleep(1000);
    	   
    	   //When the value=1 it will print what is below and finish the loop
    	   if (value ==1)
    	   {
    		   System.out.println("Blast Off!");
    	   }
       }

	}

}
