package fundamentals;
//static method
import java.util.Scanner;

public class Fahrenheit_To_Celsius {
         double a,c;
	public static void main(String[] args) {
		double a,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter forehnheit temparature");
		a=sc.nextDouble();
		System.out.println("celsius temparature is = "+celsius(a));

	}

	static double celsius(double f)
	{
		return (f-32)*5/9;
	}
}
