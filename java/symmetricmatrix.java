import java.util.Scanner;
public class symmetricmatrix
{
	public static void main(String[] args)
	{
		System.out.println("Name:FATHIMA NAHLA P.K");
		System.out.println("Admsn_no:22MCA024");
		System.out.println("Course_code and Course_id:OOP Lab and 20MCA132");
		System.out.println("Date:24-03-23");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows:");
		int rows=sc.nextInt();
		System.out.println("enter no of columns:");
		int cols=sc.nextInt();
		int matrix[][]=new int[rows][cols];
		System.out.println("enter the elements:");
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++)
				matrix[i][j]=sc.nextInt();
		sc.close();
		System.out.println("printing the input matrix:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
				System.out.print(matrix[i][j]+"\t");
			System.out.println();
		}
		if(rows!=cols)
			System.out.println("the given matrix is not a square matrix");
		else
		{
			boolean symmetric=true;
			for(int i=0;i<rows;i++)
				for(int j=0;j<cols;j++)
					if(matrix[i][j]!=matrix[j][i])
					{
						symmetric=false;
						break;
					}
			if(symmetric)
			{
				System.out.println("the given matrix is symmetric");
			}
			else
			{
				System.out.println("the given matrix is not a symmetric");
			}
		}
			
	}	
}
				
				
				
				
				
				
				
				
				
				
				
				
			
			
			
			
			
			
			
			
			
			
			
			
					
		
		
		
