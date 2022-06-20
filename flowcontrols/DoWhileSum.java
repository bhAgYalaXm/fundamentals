package flowcontrols;

public class DoWhileSum {

	public static void main(String[] args) {
		
		int i=1,sum=0;
		do {
			System.out.println(i);
			sum+=i;
			++i;
		}while(i<=10);
		System.out.println("sum ="+sum);

	}

}
