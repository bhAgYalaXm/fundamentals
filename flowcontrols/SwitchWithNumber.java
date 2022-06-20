package flowcontrols;

import java.util.Scanner;

public class SwitchWithNumber {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("------------------");
		System.out.println("Switch application");
		System.out.println("-----------------------");
		System.out.println("| 1.Add |");
		System.out.println("| 2.sub |");
		System.out.println("| 3.mul |");
		System.out.println("| 4.div |");
		System.out.println("-----------------------");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		System.out.println("Enter A value");
		int a=sc.nextInt();
		System.out.println("Enter B value");
		int b=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Result ="+(a+b));
			break;
		case 2:
			System.out.println("Result ="+(a-b));
			break;
		case 3:
			System.out.println("Result ="+(a*b));
			break;
		case 4:
			System.out.println("Result ="+(a/b));
			break;
		default:
			System.out.println("plz select your choice in given 1-4 range only");
			
		}
		
		
	}
}
