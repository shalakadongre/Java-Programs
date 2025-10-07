package day4assignment;

import java.util.Scanner;

public class Convert_tempreture {
	
	public static void main(String[] args)
	{
		double tempinF;
		double tempinC;
		double tempinK;
		double tempreture = 0;
		
	
		Scanner  number1 = new Scanner(System.in);
		System.out.println("Plese enter temperature - " );
		if(!(number1.hasNextDouble()))
		{
			System.out.println("This is not valid number");
		}
		else 
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("To convert tempreture Celsius to Fahrenheit enter 1");
			System.out.println("To convert tempreture Celsius to Kelvin enter 2 ");
			System.out.println("To convert tempreture Fahrenheit to Celsius enter 3");
			System.out.println("To convert tempreture Fahrenheit to Kelvin enter 4 ");
			System.out.println("To convert tempreture Kelvin to Farhanite enter 5");
			System.out.println("To convert tempreture Kelvin to Celsius enter 6 ");
			
		
			if (scanner.hasNextInt())
			{
				int choice = scanner.nextInt();
				switch(choice) {
				case 1 :
					tempinF = (tempreture*9/5)+32;
					System.out.println("Tempreture in Fahrenteit is " + tempinF);
					break;
				case 2 :
				    tempinK = tempreture+273.15;
				    System.out.println("Tempreture in Fahrenteit is " + tempinK);
				    break;
				case 3 :
				    tempinC = (tempreture-32)*5/9;
				    System.out.println("Tempreture in Fahrenteit is " + tempinC);
				    break;
				case 4 :
					tempinK = (tempreture-32)*5/9 +273.15;
					System.out.println("Tempreture in Fahrenteit is " + tempinK);
					break;
				case 5 :
					tempinF = (tempreture-273.15)*9/5+32;
					System.out.println("Tempreture in Fahrenteit is " + tempinF);
					break;
				case 6 :
					tempinC = (tempreture -273.15);
					System.out.println("Tempreture in Fahrenteit is " + tempinC);
				}
		    }
			else
			{
				System.out.println("Thats not a valid choice");
			}
		
		}	
		
	}
}
