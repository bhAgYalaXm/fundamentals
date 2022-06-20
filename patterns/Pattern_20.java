package patterns;

public class Pattern_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=n;j++)
			{
				System.out.print(((i*j)%2)+" ");
				
			}
			
			System.out.println();
		}
	}

}
