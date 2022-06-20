package operators;

public class LogicalOprators {

	public static void main(String[] args) {
		int a=10,b=50;
		System.out.println((a > b) && (b != a) ? "true" : "false");
		System.out.println((a > b) || (b == a) ? "true" : "false");
		System.out.println(!(a > b) && (b != a) ? "true" : "false");
		System.out.println((a++) + (++a) + (--a) + (a--));
	}

}
