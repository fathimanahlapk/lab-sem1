import java.util.Arrays;
import java.util.Scanner;
public class StringSort 
{
	public static void main(String [] args)
	{
		System.out.println("Name:FATHIMA NAHLA P.K");
		System.out.println("Admsn_no:22MCA024");
		System.out.println("Course_code and Course_id:OOP Lab and 20MCA132");
		System.out.println("Date:25-04-23");
		int count = 0;
		String tmp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of strings to sort: ");
		count = scan.nextInt();
		String str [] = new String[count];
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter strings: ");
		for(int i=0; i<count; i++)
			str [i] = scan1.nextLine();
		System.out.println("1. inbuilt sort() \n 2. user defined sorting()");
		System.out.println("Enter your choice: ");
		int choice;
		choice = scan.nextInt();
		switch (choice)
		{
			case 1: Arrays.sort(str);
				System.out.println(Arrays.toString(str));
				break;	
			case 2: for(int i=0; i<count; i++)
					for(int j=1; j<str.length; j++)
					if(str[i].compareTo(str[j])>0)
					{
					  tmp = str[i];
					  str[i] = str[j];
					  str[j] = tmp;	
					}
			System.out.println(Arrays.toString(str));
			break;
		}
	}
}

