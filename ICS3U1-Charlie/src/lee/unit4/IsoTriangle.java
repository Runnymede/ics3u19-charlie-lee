package lee.unit4;

import java.util.Scanner;

public class IsoTriangle {
	
	//Method used to printout spaces 
	public static void saveSpaces(int space)
	{

		for (int size2=space; size2>=0; size2--)
		{
			System.out.print(" ");
		}
	}
     //Method used to printout stars
	public static void drawStars(int stars)
	{

		for(int stars2=-1; stars2<stars; stars2++)
		{
			if (stars2==-1)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print("**");
			}
		}
		System.out.println();

	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		System.out.println("How big is your triangle?");
		
		//Variables
		int size = sc.nextInt();
		int complete2 = size;
		
		//Continuously loops till the triangles maximum size is reached.
		for(int complete=0; complete<complete2; complete++)
		{
			//Methods are called
			saveSpaces(size);
			drawStars(complete);

			size--;
		}

	}

}
