package fundamentals;

public class VariableTypes {
	int b=30; //instance variable
	static int c=40; //static variable 
	public static void main(String args[])
	{
		VariableTypes vt=new VariableTypes();
		int a=10; //local variable
		System.out.println("A="+a);
		System.out.println("B="+vt.b);
		System.out.println("c="+c);
	}
	public void m1()
	{
		System.out.println("B="+b);
		System.out.println("c="+c);
	
	}
}
