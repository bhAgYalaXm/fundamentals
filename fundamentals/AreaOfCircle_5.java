package fundamentals;

import java.util.Scanner;

public class AreaOfCircle_5 {

	static double area(double r)
	{
		return (22*r*r)/7;
	}

public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the radius");
 double rad=sc.nextDouble();
 double a=area(rad);
 System.out.println("area od circle :"+a);
 
	
}
}
