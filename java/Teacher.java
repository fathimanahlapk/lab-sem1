import java.util.Scanner;
class Employees 
{
    int Empid;
    String Name;
    double Salary;
    String Address;
    Employees(int no, String na, double sal, String add) 
    {
        this.Empid = no;
        this.Name = na;
        this.Salary = sal;
        this.Address = add;
    }
}
class Teacher extends Employees
{
	String dept;
	String subject;
	Teacher(int no, String na, double sal, String add, String dept, String sub)
	{
	super(no,na,sal,add);
	this.dept= dept;
	this.subject=sub;
}
void display()
{
    System.out.println("Employee id: "+Empid);
    System.out.println("Name: "+Name);
    System.out.println("Salary: "+Salary);
    System.out.println("Address: "+Address);
    System.out.println("Department: "+dept);
    System.out.println("Subject: "+subject);
}
public static void main(String[] args)
{
	System.out.println("Name:FATHIMA NAHLA P.K");
	System.out.println("Admsn_no:22MCA024");
	System.out.println("Course_code and Course_id:OOP Lab and 20MCA132");
	System.out.println("Date:07-06-23");
	System.out.println("____________________________________\n\n");
    	System.out.println("Enter the No. of Employee's");
	Scanner sc1 = new Scanner(System.in);
	int num = sc1.nextInt();
	Teacher arr[]=new Teacher[num];
	for(int i =0;i<num;i++)
    	{
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Employee id: ");
        int Empid=sc.nextInt();
        System.out.println("Enter Employee Name: ");
        String Name=sc.next();
        System.out.println("Enter Salary: ");
        double Salary=sc.nextDouble();
        System.out.println("Enter Address: ");
        String Address=sc.next();
        System.out.println("Enter department: ");
        String dept=sc.next();
        System.out.println("Enter Subject: ");
        String subject=sc.next();
        arr[i]=new Teacher(Empid,Name,Salary,Address,dept,subject);
   	}
    System.out.println("\n**Informations of all the employee's**");
    for(int i=0;i<num;i++)
    {
        int j=i+1;
        System.out.println("\n"+j+").");
        arr[i].display();
    }
sc1.close();
}
}
