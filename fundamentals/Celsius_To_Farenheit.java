package fundamentals;

import java.util.Scanner;

public class Celsius_To_Farenheit {
	
        double a,c;
	public static void main(String[] args) {
		double a,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter celsius temparature");
		a=sc.nextDouble();
		System.out.println("Farenheit temparature is = "+forenheit(a));

	}

	static double forenheit(double c)
	{
		return ((9*c)/5)+32;
	}
}
