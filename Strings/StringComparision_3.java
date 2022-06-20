package Strings;
//by using == operator
public class StringComparision_3 {

	public static void main(String[] args) {
		String s1="sachin";
		String s2="sachin";
		String s3=new String("sachin");
		System.out.println(s1==s2);//true(bcz both refer to same instance)
		System.out.println(s1==s3);//false(bcz s3 refer to instance created in non pool)
		

	}

}
