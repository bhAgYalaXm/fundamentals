package Strings;

public class String_1 {

	public static void main(String[] args) {
		String str="Hyderabad";
		System.out.println("string length           = "+str.length());
        System.out.println("0 index character       = "+str.charAt(0));
        System.out.println("character index value   = "+str.indexOf(0));
        System.out.println("bad is there in str     = "+str.contains("bad"));
        System.out.println("substring value         = "+str.substring(6,9));
        System.out.println("uppercase               = "+str.toUpperCase());
        System.out.println("lowercase               = "+str.toLowerCase());
        System.out.println("hello"+str);
        String str1=" hi ";
        System.out.println(str1);
        System.out.println(str1.trim());
        
	}

}
