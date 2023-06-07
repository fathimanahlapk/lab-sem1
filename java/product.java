public class product
{
	int pcode;
	String pname;
	double price;
	double lowest;
	void data(int c,String n,double p)
	{
		pcode=c;
		pname=n;
		price=p;
	}
	void display()
	{
	System.out.println(pcode+"\t"+pname+"\t"+price);
	}
	static void findLowest(double price1,double price2,double price3)
	{
		if(price1<=price2 && price1<=price3)
		{
			System.out.println("\n product 1 is of the lowest price");
		}
		else if(price2<=price1 && price2<=price3)
		{
	        	System.out.println("\n	Product 2 is of the lowest price");
	        }
	        else
	        {
	        	System.out.println("\n Product 3 is of the lowest price");
	        }
	}
	public static void main(String[] args)
	{
		System.out.println("Name:FATHIMA NAHLA P.K");
		System.out.println("Admsn_no:22MCA024");
		System.out.println("Course_code and Course_id:OOP Lab and 20MCA132");
		System.out.println("Date:24-03-23");
		product obj1=new product();
		product obj2=new product();
		product obj3=new product();
		obj1.data(101,"Product_1",110.0);
		obj2.data(102,"Product_2",120.0);
		obj3.data(103,"Product_3",130.0);
		System.out.println("product info:\n product_code\t product_name\tproduct_price");
		obj1.display();
		obj2.display();
		obj3.display();
		findLowest(obj1.price,obj2.price,obj3.price);
	}
}
		
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
		                                                                                                      
