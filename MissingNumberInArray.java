package day6assignments;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int[] givenArray = {1,2,5,3};
		int[] standardArray = {1,2,3,4,5};
		int sum  = 0;
		int sum1 = 0;
		
		for (int i =0  ; i< standardArray.length;i++)
			
		{
			sum = sum +standardArray[i];
		}
		for (int i =0  ; i< givenArray.length;i++)
			
		{
			sum1 = sum1 +givenArray[i];
		}

		if (sum-sum1 ==0)
		{
			System.out.println("There is no missing number in array");
		}
		else 
		{
			System.out.println("The missing number is : " + (sum-sum1));
		}
	}

}
