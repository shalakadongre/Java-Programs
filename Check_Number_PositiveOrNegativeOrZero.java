package day4assignment;

import java.util.Scanner;

public class Check_Number_PositiveOrNegativeOrZero {
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the number to check :");
		int x = scanner.nextInt();
		
		if (x > 0)
		{ System.out.println("The number " + x + " is positive");
		}
		else if (x ==0)
		{
			System.out.println("The number " + x + " is zero");
		}
		else
		{
			System.out.println("The number " + x + " is negative");
		}
	
	}

}
