package fundamentals;

public class Xyz {

	public static void main(String args[])
	{
		System.out.println(VariableTypes.c); // accessing static variable in another class by using class name
		VariableTypes vt=new VariableTypes();//accesing instance variable in other class by creating instance or object
		System.out.println(vt.b);
	}
}
