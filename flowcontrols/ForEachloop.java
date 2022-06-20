package flowcontrols;

public class ForEachloop {

	public static void main(String[] args) {
		
		int[] arr= {10,20,30,40,50};
		
			System.out.println("---normal for loop---");
		for(int i=0;i<=arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("---for each loop---");
		for(int k:arr)
		{
			System.out.println(k);
		}

	}

}
