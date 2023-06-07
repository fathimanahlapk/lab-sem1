import java.util.Scanner;
public class overloadshapearea
{
	
	void calculatearea(float x)
	{
	System.out.println("area of the square:"+x*x+"sq_units");
	}
	void calculatearea(float x,float y)
	{
	System.out.println("area of the rectangle:"+x*y+"sq_units");
	}
	void calculatearea(double r)
	{
	double area=3.14*r*r;
	System.out.println("area of the circle :"+area+"sq_units");
	}
	public static void main(String args[])
	{
	System.out.println("Name:FATHIMA NAHLA P.K");
	System.out.println("Admsn_no:22MCA024");
	System.out.println("Course_code and Course_id:OOP Lab and 20MCA132");
	System.out.println("Date:25-04-23");
	overloadshapearea obj = new overloadshapearea();
	System.out.println("enter the side of a square:");
	Scanner sc=new Scanner(System.in);
	float side=sc.nextFloat();
	obj.calculatearea(side);
	System.out.println("enter the side of the rectangle");
	float side1=sc.nextFloat();
	float side2=sc.nextFloat();
	obj.calculatearea(side1,side2);
	System.out.println("enter the radius of the circle:");
	double rad=sc.nextDouble();
 	obj.calculatearea(rad);
 	}
 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

