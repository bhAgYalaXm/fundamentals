package fundamentals;

import java.util.Scanner;

public class AddingTwoNumbers_Methods{
	
	public int addTwoNumbers(int i,int j)
	{
		return i+j;
	}
	public static void main(String args[])
	{
		 AddingTwoNumbers_Methods obj=new AddingTwoNumbers_Methods();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter A value");
		 int a=sc.nextInt();
		 System.out.println("Enter B value");
		 int b=sc.nextInt();
		 System.out.println("c="+obj.addTwoNumbers(a,b));
		 
		sc.close();
	}
}
