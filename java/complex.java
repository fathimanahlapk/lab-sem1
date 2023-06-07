public class complex
{
	double real,img;
	complex(double r,double i)
	{
		this.real=r;
		this.img=i;
	}
	
	public static complex sum(complex c1, complex c2)
	{
		complex temp=new complex(0,0);
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;
	}
	public static void main(String args[])
	{
		complex c1=new complex(5.5,4);
		complex c2=new complex(1.2,3.5);
		complex temp=sum(c1,c2);
		System.out.println("Name:FATHIMA NAHLA P.K");
		System.out.println("Admsn_no:22MCA024");
		System.out.println("Course_code and Course_id:OOP Lab and 20MCA132");
		System.out.println("Date:24-03-23");
		System.out.println("Sum is :"+temp.real+"+"+temp.img+"i");
	}
	 
}
