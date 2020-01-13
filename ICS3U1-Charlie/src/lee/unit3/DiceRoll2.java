package lee.unit3;
/**
 *<br>A program that incorpates the array to make a table of sums
 *<br>from two random dice roll values that are added
 * <br>created on Oct 8th, 2019
 *<br>@author Charlie Lee
 */


public class DiceRoll2 {

	public static void main(String[] args) {
        
		//variables
		int total;
		int counter =2;
		
		//Array storage
		int[] totalKeeper = {0,0,0,0,0,0,0,0,0,0,0,0};
		

		//Loop to make a thousand numbers
		for (int num=1; num<=10000; num++)
		{
			
			//Random dice roll creator
			int diceroll1 = (int) (Math.random()*6)+1;
			int diceroll2 = (int) (Math.random() *6)+1;
			
			//Creates the sum
			 total = diceroll1 + diceroll2;
			 
			     //Checks for the total sum and adds to the corresponding array index
            	 if (total ==12)
            	 {
            		 totalKeeper[10]++;
            	 }
            	 else if (total==11)
            	 {
            		 totalKeeper[9]++;
            	 }
            	 else if (total==10)
            	 {
            		 totalKeeper[8]++;
            	 }
            	 else if (total==9)
            	 {
            		 totalKeeper[7]++;
            	 }
            	 else if (total==8)
            	 {
            		 totalKeeper[6]++;
            	 }
            	 else if (total==7)
            	 {
            		 totalKeeper[5]++;
            	 }
            	 else if (total==6)
            	 {
            		 totalKeeper[4]++;
            	 }
            	 else if (total==5)
            	 {
            		 totalKeeper[3]++;
            	 }
            	 else if (total==4)
            	 {
            		 totalKeeper[2]++;
            	 }
            	 else if (total==3)
            	 {
            		 totalKeeper[1]++;
            	 }
            	 else if (total==2)
            	 {
            		  totalKeeper[0]++;
            	 }
            }
            
		//Prints out the total number of rolls
		 System.out.println("Total Number Of Rolls");
	  for (int h =0; h<=10; h++)
	  {
		 System.out.print("Sum "+counter+": ");
		 System.out.println(totalKeeper[h]);
		 counter++;
	  }
	     

    
	}

}

