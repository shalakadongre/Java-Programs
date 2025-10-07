package day4assignment;

import java.util.Scanner;

public class Convert_currency {

	public static void main(String[] args) {
			{
				double usd;
				double eur;
				double inr;
				double amount;
				
			
				Scanner number1 = new Scanner(System.in);
				System.out.println("Plese enter an amount to convert" );
				
				if (!(number1.hasNextDouble()))
				{
					
					System.out.println("This is not valid amount");
				}
				else 
				{
					amount = number1.nextDouble();
					Scanner scanner = new Scanner(System.in);
					System.out.println("To convert USD to EUR enter 1");
					System.out.println("To convert EUR to USD enter 2 ");
					System.out.println("To convert USD to INR enter 3");
					System.out.println("To convert INR to USD enter 4 ");
					
				
					if (scanner.hasNextInt())
					{
						int choice = scanner.nextInt();
						switch(choice) {
						case 1 :
							eur = (amount*.97);
							System.out.println("The converted amount USD to EUR is " + eur);
							break;
						case 2 :
							usd = amount*1.03;
						    System.out.println("The converted amount EUR to USD is " + usd);
						    break;
						case 3 :
						    inr = amount*86.58;
						    System.out.println("The converted amount USD to INR is " + inr);
						    break;
						case 4 :
							usd = amount*0.012;
							System.out.println("The converted amount INR to USD is " + usd);
							break;
						}
				    }
					else
					{
						System.out.println("Thats not a valid choice");
					}
				
				}	
			}			
	}		

}
