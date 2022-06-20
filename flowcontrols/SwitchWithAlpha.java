package flowcontrols;

import java.util.Scanner;

public class SwitchWithAlpha {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("------------------");
		System.out.println("Switch application");
		System.out.println("-----------------------");
		System.out.println("| a.Add |");
		System.out.println("| b.sub |");
		System.out.println("| c.mul |");
		System.out.println("| d.div |");
		System.out.println("-----------------------");
		System.out.println("Enter your choice");
		char choice=sc.next().charAt(0);
		System.out.println("Enter A value");
		int a=sc.nextInt();
		System.out.println("Enter B value");
		int b=sc.nextInt();
		
		switch(choice) {
		case 'a':
			System.out.println("Result ="+(a+b));
			break;
		case 'b':
			System.out.println("Result ="+(a-b));
			break;
		case 'c':
			System.out.println("Result ="+(a*b));
			break;
		case 'd':
			System.out.println("Result ="+(a/b));
			break;
		default:
			System.out.println("plz select your choice in given a-d range only");
			

	}
	}
}


