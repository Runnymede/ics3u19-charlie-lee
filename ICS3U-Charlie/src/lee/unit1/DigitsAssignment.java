package lee.unit1;

import java.util.Scanner;

public class DigitsAssignment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//* h for hundred, t for tens, and o for ones
		//**
		int h;
		int t;
		int o;
		
		System.out.println("Enter a digit between 0 and 999");
		int d = sc.nextInt();
		//*added a scanner for the digit (d) between 0 to 999
		//**
		h = d/100;
		t = d%100/10;
		o = d%10;
		System.out.println("Hundreds: "+ h);
		System.out.println("Tens: "+ t);
		System.out.println("Ones: "+ o);
		
		

	}

}
