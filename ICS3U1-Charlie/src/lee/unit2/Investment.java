package lee.unit2;
/**
 *<br>A program that incorpates the do while loop to
 *<br>see how many years it takes to make a investment total of 5000 dollars.
 * <br>created on Oct 8th, 2019
 *<br>@author Charlie Lee
 */

public class Investment {

	public static void main(String[] args) {
		
		//2,500 investment turns into 5,000
		//How many years will this take if the investment amount
		//increases by 7.5% per year
		
		//variables
		double investmentCalculate;
		int year = 0;
        double investmentConstant = 2500;
		double investmentPerYear;
		
		//Loops until the investment goal is reached
		do 
		{
			//Calculations
			investmentPerYear = investmentConstant * 0.075;
			investmentConstant = investmentConstant +  investmentPerYear;
            
			//Counting how many years it takes
			year = year +1;
           
       
		
		}while (investmentConstant < 5000 );
		 System.out.println("It takes "+year+" years to make "+investmentConstant);
		

	}
}


