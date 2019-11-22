package lee.unit2;

import java.util.Scanner;
/**
 * Many programs that is incorpated with different strings
 * created on Oct 8th, 2019
 *@author Charlie Lee
 */

public class StringThings {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1) Do the following:
		//a) The string they entered
		//b) the string they entered all uppercase
		//c) the string they entered all lowercase
		//d) The length of the string
		//e) The character at index 6
		//(for bonus, have the user enter which index to print the character)
		

		
		//entering the first program
		System.out.println("First Program:");
		System.out.println();
		
		//variables for first program
		String word;
		
		//prompts the user for a word
		System.out.println("Enter a word that is 7 or more characters long");
		word = sc.next();
		
		//String variables
		String UpperWord = word.toUpperCase();
		String LowerWord = word.toLowerCase();
		int Length = word.length();
		char IndexSix = word.charAt(6);
	
		//The output of all of all the variations of the string variables
		System.out.println("The word you have entered is "+ word);
		System.out.println("The word you have entered in UpperCase is " + UpperWord);
		System.out.println("The word you have entered in LowerCase is "+LowerWord);
		System.out.println("The amount of characters in your word is "+ Length);
		System.out.println("The sixth character in your word is "+ IndexSix);
		System.out.println();
	
		//2) Do the following:
		//Prompt the user to enter 2 words.
		//a) Determine if they are the same.
		//b) Determine which word comes before the other.
		
		
		//entering the second program
		System.out.println("Second Program:");
		System.out.println();
		
		//variables for program 2
		String wordone;
		String otherword;
		
		//prompts the user to enter one word
		System.out.println("Enter One word");
		wordone = sc.next();
		
		//prompts the user to enter second word
		System.out.println("Enter Another Word");
		otherword = sc.next();
		
		
		//comparing the first word and the second word to see if it is before, after, or the same as the first word
		if (wordone.compareToIgnoreCase(otherword) == 0)
		{
			System.out.println(wordone+" is the same as " +otherword);
			System.out.println();
		}
		else if (wordone.compareToIgnoreCase(otherword) < 0)
		{
			System.out.println(wordone +" is not the same as "+otherword);
			System.out.println(wordone+ " comes before "+otherword);
			System.out.println();
		}
		else if (wordone.compareToIgnoreCase(otherword) > 0)
		{
			System.out.println(wordone+ " is not the same as " +otherword);
			System.out.println(wordone+ " comes after "+otherword);
			System.out.println();
		}
		
		//3) Do the following:
		//Prompt the user to enter both the username and password.
		//If the user enters them correct print "Welcome" and their name
		//If they enter incorrectly tell them they have the incorrect username or password.
		
		//Entering the third program
		System.out.println("Third Program:");
		System.out.println();
		
		//variables for third program
		String username;
		String password;
		
		//Variables for correct password and username
		String cusername = "chocolate";
		String cpassword = "milk";
		
		//prompts the user for a username
		System.out.println("Welcome to the FBI Login Page, Please enter your username");
		username = sc.next();
		
		//prompts the user for a password
		System.out.println("Please Enter your password");
		password = sc.next();
		
		//Comparing the username and password the user wrote to the correct username and password
		if (username.contentEquals(cusername) && password.contentEquals(cpassword))
				{
			     System.out.println("Welcome to the Federal Bureau of Investigation");
				}
	    else
		{
			System.out.println("Intruder Alert!");
		}
		
		
		
		
	
		
		

	}

}
