package strings;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		System.out.println(str);
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(str.length()-1));
		System.out.println(str.length());
		
		System.out.println(str.substring(2,4));
		System.out.println(str.substring(2,5));
		System.out.println(str.substring(3,3));
		System.out.println(str.substring(0,3));
		System.out.println(str.substring(3));
		
		String s1 = "hi";
		String s2 = "bye";
		String s3 = s1+s2;
		System.out.println(s3);
		String s4 = s1.concat(s2);
		System.out.println(s4);
		
		System.out.println(str.indexOf('e'));
		System.out.println(str.indexOf('E'));
		
		System.out.println(str.startsWith("he"));
		System.out.println(str.startsWith("He"));
		
		s1 ="Hello";
		s2 = s1;
		s3 = "Hello";
		s4 = new String("Hello");
		
		System.out.println((s1 == s2)+ ","+ s1.equals(s2)); //true true
		System.out.println((s1 == s3)+ ","+ s1.equals(s3)); //true true
		System.out.println((s1 == s4)+ ","+ s1.equals(s4)); //false true
		
		
	}

}
