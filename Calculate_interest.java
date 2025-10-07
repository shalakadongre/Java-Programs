package day4assignment;

import java.lang.Math;

public class Calculate_interest {

	public static void main(String[] args)
	{
	
	
		double interest = 0;
		double principal = 1000;
		double rate = 5;
		double years = 10;
		double compoundint = 0.0;
		
	interest = principal*rate*years/100;
			System.out.println("the interest is " + interest);
			compoundint = principal *Math.pow((1 + rate/100),years);
			System.out.println("The compound interest is "+ compoundint);
	}

	
	}


