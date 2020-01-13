package lee.unit3;
/**
 *<br>A program that incorpates the array and makes a childrens song
 * <br>created on Oct 8th, 2019
 *<br>@author Charlie Lee
 */


public class HappyClap {

	public static void main(String[] args) {
		
		//creating a total array storage of 10
		String [] arrayOf = new String [10];
		
		//song lyrics
		String[] songLyrics = {"clap your hands", "breathe some air", "have some fun", "put on a smile", "jump up", "play some games", "draw some pictures", "stomp on the ground", "dance around", "play with friends"};
		
		//counter to change the song lyrics
		int arrayNum= 0;
		
		//for loop to create 10 different segments of the song
		for (int x=0; x<10; x++)
		{
		    for (int b=0; b<=5; b++)
		    {
		    	System.out.println("If your happy and you know it "+songLyrics[arrayNum]);
		    	System.out.println("If your happy and you know it "+songLyrics[arrayNum]);
		    	System.out.println("If your happy and you know it and you really wanna show it");
		    	System.out.println("If your happy and you know it "+songLyrics[arrayNum]);
                System.out.println();
                arrayNum++;
		    }


		}

	}

}
