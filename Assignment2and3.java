package day7assignments;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
	//Assignment 1 - remove spaces in the string
		
		String s = "We l c ome   to U  s";
		String s1 = "";
		s1 = s.replace(" ","");
		System.out.println("The new string without spaces is :-" +s1);
		
	// Assignment 2 -  find words in string
		int count = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("please type a string in double quotes to count the words :");
		
		if (scanner.hasNext())
		{		
			s = scanner.nextLine();
			System.out.println(s);			
			
	
			s= s.stripLeading();
			System.out.println(s);			
			
			s = s.stripTrailing();
			System.out.println(s);			
			for (int i=0;i<s.length();i++)
			{	
				System.out.println(s.charAt(i));
				if(Character.isWhitespace(s.charAt(i)))
				{ 
					if (!(Character.isWhitespace(s.charAt(i-1))))
					{
						count++;					
					}
				}
			}
			
			System.out.println("the word count in string is "+ count);
		}
		else
		{
			System.out.println("not a valid string");
		}

}
}
