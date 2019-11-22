package lee.unit2;

import java.util.Scanner;

public class CountVowels {
	/**
	 *<br>A program that incorpates the for loop to count
	 *<br>how many vowels there are in the word that is entered
	 * <br>created on Oct 8th, 2019
	 *<br>@author Charlie Lee
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//prompts user for a word
		System.out.println("Please enter a word");
		String word = sc.nextLine();
		
		//Variables
		int indexCount=0;
	    int length = word.length();
	    int counter = 0;
	    
	    //Loop to check until it checks the final letter of the word
	    for (int i=1; i<=length; i++)
	    {
	    	//checks what letter is at 'indexCount' variable
	    	char index = word.charAt(indexCount);
	        indexCount = indexCount +=1;
	        
	        //Vowels checker
	        if (index == 'a' || index=='A' || index== 'i'  || index== 'I' || index== 'e'|| index =='E'|| index== 'o' ||index =='o' || index =='U' ||index== 'u')
	        {
	        	counter += 1;
	        }
	    }
	   
	    //Output
	    System.out.println("There is "+counter+" vowels");
		
		

	}

}
