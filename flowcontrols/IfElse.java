package flowcontrols;

import java.util.Scanner;

public class IfElse {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=sc.nextInt();
		if(number%2==0)
		{
			System.out.println("given number is Even");
		}
		else
		{
			System.out.println("Gven number is odd");

		}
	}
}
