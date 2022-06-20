package fundamentals;

import java.util.Scanner;
//using Interface
public interface AreaCal {
	
 void circle(double r);
 
}
class AreaOfCircle implements AreaCal
{
	double area;
	public void circle(double r)
	{
		area=(22*r*r)/7;
	}
	public static void main(String args[])
	{
		AreaOfCircle x;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Radius");
		double rad=s.nextInt();
		x=new AreaOfCircle();
		x.circle(rad);
		System.out.println("Area of circle :"+x.area);
	}
}
