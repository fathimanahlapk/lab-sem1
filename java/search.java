import java.util.Scanner;

public class Search {
  public static void main(String[] args){
  System.out.println("Name:FATHIMA NAHLA P.K");
		System.out.println("Admsn_no:22MCA024");
		System.out.println("Course_code and Course_id:OOP Lab and 20MCA132");
		System.out.println("Date:25-04-23");

    int c, n, search, array[];
    
 
    
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of elements: ");
    n = in.nextInt();
    array = new int[n];
    
    System.out.println("Enter those " + n + " elements: ");
    
    for (c = 0; c < n; c++)
      array[c] = in.nextInt();
    
    System.out.println("Enter value to find: ");
    search = in.nextInt();
    
    for (c=0; c<n; c++)
      if(array[c] == search)
      {
        System.out.println(search + " is present at location " + (c+1));
        
        break;
      }
    if (c == n)
      System.out.println(search + "isn't presesnt in array.");
  }
}
