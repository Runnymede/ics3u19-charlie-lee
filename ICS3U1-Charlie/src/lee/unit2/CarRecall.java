package lee.unit2;
/**
 *<br>A program that incorpates the switch method to
 *<br>see if the case number of cars are defects or not
 * <br>created on Oct 8th, 2019
 *<br>@author Charlie Lee
 */


import java.util.Scanner;

public class CarRecall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your model number to check if it has a defect");
		int model = sc.nextInt();
		String modelNumber;
		switch (model)
		//Cars with defects 199, 179, 189 through 195, 221, and 780 
		
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
		
		
		
				
		

	}

}
