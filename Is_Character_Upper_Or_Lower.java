package day4assignment;

import java.util.Scanner;

public class Is_Character_Upper_Or_Lower {

	public static void main(String[] args)
	{
	Scanner initial = new Scanner(System.in);	
	System.out.println("please enter a character to check - ");
	char letter = initial.next().charAt(0);
			
	if (Character.isUpperCase(letter))
	{
		System.out.println("The Character entere is in Upper case");
	}
	else
	{
		System.out.println("The Charachter entered is in Lowaer case");
	}
		
	}

}
