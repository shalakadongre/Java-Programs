package day4assignment;

import java.util.Scanner;

public class DivisibleBy5Or11 {

	public static void main(String[] args)
	{
	Scanner	scanner = new Scanner(System.in);
	System.out.println("please enter number");
	int x = scanner.nextInt();
	
	if (x%5 == 0 && x%11 == 0)
	{
		System.out.println("The number " + x +" is divisible by 5 and 11");
	}
	else
	{
		System.out.println("The number "+x+" is not divisible by 5 or 11 ");
	}
	}

}
