package day4assignment;

import java.lang.Math;
public class EMI_calculator {

		public static void main(String[] args)
		{
			double principal = 50000;
			double rate = 5;
			double time = 12;
			double emi = 0.0;
			
			rate = rate/(12*100);
			time = time*12;
			emi = (principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate, time)-1);
				System.out.println("The EMI is "+ emi);
		}

		
		}



	


