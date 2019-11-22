package lee.unit2;
/**
 *<br>A program that incorpates the switch method to
 *<br>see if the case number of cars are defects or not
 *<br>and has the ability to continue asking for a case number until 0 is entered
 * <br>created on Oct 8th, 2019
 *<br>@author Charlie Lee
 */


import java.util.Scanner;

public class CarRecall2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		
		//Cars with defects 199, 179, 189 through 195, 221, and 780 
		
		System.out.println("Please enter your model number to check if it has a defect, Enter 0 to stop");
	   int model;
		
		do{
			model =sc.nextInt();
			String modelNumber;
			switch (model)
			{
			case 199: modelNumber =("Your car is defective. It must be repaired");
	        break;
	        case 179: modelNumber = ("Your car is defective. It must be repaired");
	        break;
	        case 180: modelNumber = ("Your car is defective. It must be repaired");
	        break;
	        case 181: modelNumber = ("Your car is defective. It must be repaired");
	        break;
	        case 182: modelNumber = ("Your car is defective. It must be repaired");
	        break;
	        case 183: modelNumber = ("Your car is defective. It must be repaired");
	        break;
	        case 184: modelNumber = ("Your car is defective. It must be repaired");
	        break;
	        case 185: modelNumber = ("Your car is defective. It must be repaired");
	        break;
	        case 186: modelNumber = ("Your car is defective. It must be repaired");
	        break;
	        case 187: modelNumber = ("Your car is defective. It must be repaired");
	        break;
	        case 188: modelNumber = ("Your car is defective. It must be repaired");
	        break;
	        case 189: modelNumber = ("Your car is defective. It must be repaired");
	        break;
	        case 195: modelNumber = ("Your car is defective. It must be repaired");
	        break;
	        case 221: modelNumber = ("Your car is defective. It must be repaired");
	        break;
	        case 780: modelNumber = ("Your car is defective. It must be repaired");
	        break;
	        default: modelNumber = ("Your car has no defects, you can safetly drive!");
	        break;
	        
			}
			System.out.println(modelNumber);
		} while ( model != 0 );
		
		System.out.println("Goodbye");
			
			
		}
		
}
