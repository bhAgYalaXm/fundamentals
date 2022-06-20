package fundamentals;

import java.util.Scanner;

//using static method
public class AreaOfCircle_1 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		double r=sc.nextDouble();
		double area=(22*r*r)/7;
		System.out.println("Area of the Circle :"+area);
	}
}
