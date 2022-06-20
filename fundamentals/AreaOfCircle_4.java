package fundamentals;

import java.util.Scanner;

public class AreaOfCircle_4 {

	double area;
	AreaOfCircle_4(double r)
	{
		area=(22*r*r)/7;
	}

}
class Area 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the radius");
	      double rad =sc.nextDouble();
	      AreaOfCircle_4 a = new AreaOfCircle_4(rad);
	      System.out.println("Area of Circle :"+a.area);

	}
}
