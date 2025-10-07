package day6assignments;

public class FindLargesAndLowest {
	public static void main(String[] args) {
	
		int [] a = {15,2,45,37,39,10,40,3,5,8};
		int largest_number = a[0];
		int lowest_number = a[0];
		
		for (int i =0; i<a.length;i++)
		{
			if(largest_number < a[i])
			largest_number = a[i];
			if(lowest_number >a[i])
				lowest_number =a[i];
	
		}
		System.out.println("Largest number is in an array A is : "+ largest_number);
		System.out.println("Lowest number is in an array A is :  "+ lowest_number);

	}
}