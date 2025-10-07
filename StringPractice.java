package day7assignments;

public class StringPractice {

	public static void main(String[] args) {

			String str1 = "World is so beautiful";
			String str2 = " We are blessed";
			String str3 = "red, black, blue, white";
			String trimedstring = "      Hello world   ";


			// print Length of a String:

			System.out.println("Length: " + str1.length());


		//	print the character at a Specific Index:

			System.out.println("Character at index 1: " + str1.charAt(1));

		//  Print Substring:

			System.out.println("Substring from index 3: " + str1.substring(3)); 

	   //	Concatenation:

			System.out.println(str1 + " " + str2);


		//	Equality Check:

			System.out.println(str1.equals(str2)); 


		//	Case Conversion:

			System.out.println(str1.toUpperCase()); 
			System.out.println(str1.toLowerCase()); 


		//	Trim Whitespaces:

			System.out.println(trimedstring.trim()); 


		//	Replace Characters:

			
			System.out.println(str1.replace('i', '?')); 


		//	Split:

			
			String[] colors  = str3.split(",");
			for (String color  :colors ) {
			    System.out.println(color);
			}
			    
			    
			

	}

}
