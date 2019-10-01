package lee.unit1;

import java.util.Scanner;

public class QuadraticFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//* Scanning per value (a b and c) Added the quadratic format
		System.out.println("The format for a quadratic is ax^2 + bx^2 + c");
		System.out.println("Enter the value for a");
	    double a = sc.nextDouble();
		System.out.println("Enter the value for b");
		double b = sc.nextDouble();
		System.out.println("Enter the value for c");
		double c = sc.nextDouble();
		double q;
		//* q for quadratic
		//**
		q = (-b +Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
		System.out.println("The value of x is"+ q);
	    double qtwo;
	    //*qtwo for the second quadratic value
	    //**
	    qtwo = (-b -Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
	    System.out.println("The other value of x is "+ qtwo);
	   
		
		
		

	}

}
