package day4assignment;

import java.util.Scanner;

public class Is_Character_Vowel_Or_Consonant {

	public static void main(String[] args) 
	{
	Scanner initial = new Scanner(System.in);
	System.out.println("Please enter a Character to check whether it is vowel or Consonant-");
	char upperLetter = Character.toUpperCase(initial.next().charAt(0));
	
	if(Character.isAlphabetic(upperLetter))
	{
		if ( (upperLetter == 'A')||  (upperLetter =='E')|| (upperLetter =='I')|| (upperLetter =='O')|| (upperLetter =='U')) 
		{
			System.out.println("The letter is an Vowel");
		}
		else
		{
			System.out.println("The letter is Consonant"); 
		}
	}
	else
		{
		System.out.println("This character is not an alphabet");
		}	
	}
}
