package flowcontrols;

import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first,second and third number");
		int firstnumber=sc.nextInt();
		int secondnumber=sc.nextInt();
		int thirdnumber=sc.nextInt();
		
		if(firstnumber>secondnumber && firstnumber>thirdnumber) {
			System.out.println("First number is largest number");
		}
		else if(secondnumber>firstnumber && secondnumber >thirdnumber)
		{
			System.out.println("second number is largest");
		}
		else if(thirdnumber >firstnumber && thirdnumber>secondnumber)
		{
			System.out.println("third number is largest number");
		}
		else
		{
			System.out.println("any two or more number are equal");
		}
		sc.close();		
	}

}
