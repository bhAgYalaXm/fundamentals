package fundamentals;

import java.util.Scanner;

public class AreaOfCircle_3 {

double area;
void circle(double r)
{
	area=(22*r*r)/7;
}

}
class AreaCir extends  AreaOfCircle_3
{
public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
      System.out.println("Enter the radius");
      double rad =sc.nextDouble();
      AreaCir a=new AreaCir();
      a.circle(rad);
      System.out.println("Area of Circle :"+a.area);
	}

}