package day6assignments;

public class TransposeMatrix {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},
					{4,5,6},
					{7,8,9}};
		int [] []b;
		b = new int[a.length][a[0].length];
		
		for (int i=0;i<a.length;i++) 
		{
			for (int j=0; j< a[i].length;j++)
			{
				b[j][i] = a[i][j];	
			}
		}
	
		for (int i=0;i<b.length;i++) 
		{
			for (int j=0; j< b[i].length;j++)
			{
				System.out.println(b[i][j]);
			}
		}
	}
           
}
