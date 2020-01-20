package lee.unit4;
/**
 *<br>A program that incorpates methods to print out different ASCII art
 * <br>created on Dec. 10th, 2019
 *<br>@author Charlie Lee
 */

public class MethodCalling {
    
	//Method used to print my name
	public static void printSignature()
	{
	
     System.out.println("  _________ .__                      .__  .__          .____  ");
     System.out.println("\\_   ___ \\|  |__ _____ _______     |  | |__| ____    |    |   ");
     System.out.println("/    \\  \\/|  |  \\\\__  \\\\_  __ \\  | |  |/ __ \\  |    |  _/ __ \\_/ __ \\");
	 System.out.println("\\     \\___|   Y  \\/ __ \\|  | \\/    |_|  \\  ___/  |    |__\\  ___/\\  ___/ ");
	 System.out.println("\\______  /___|  (____  /__|         |____/__|\\___    |_______ \\___  >\\___  >");
	}
	
	//Method used to print out an image
	public static void printImage()
	{  
     System.out.println("        _mmmMMMMMmmm_\r\n ");
     System.out.println("    _mMMMMMMPPPMMMMMMm_\r\n ");
     System.out.println("   mMMMMb:       ``YMMMm\r\n  ");
     System.out.println(" ,MMMP`MMMb_         YMMM.\r\n ");
     System.out.println(" ,MMM'   YMMMm         `MMM.\r\n ");
     System.out.println("dMMP      YMMML        YMMb\r\n  ");
     System.out.println("MMM        `YMMM.       MMM\r\n  ");
     System.out.println(" MMM.         `MMMb.    ,MMM\r\n  ");
     System.out.println("  YMMb           YMMMm   dMMP\r\n ");  
     System.out.println("   YMML            YMMMLdMMP\r\n  ");
     System.out.println("    `YM             YMMLdMMP/r/n ");
     System.out.println("      `MMMMm.__   __,mMMMM'\r\n ");
     System.out.println ("       `YMMMMMMMMMMMMMP'    ");

	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
		System.out.println("Method calling");
		Thread.sleep(2000);
		printSignature();
		Thread.sleep(1000);
		System.out.println("Method end");
		System.out.println();
		System.out.println("Method Image calling");
		Thread.sleep(2000);
		printImage();
		Thread.sleep(1000);
		System.out.println("Method Image end");
	}

}
