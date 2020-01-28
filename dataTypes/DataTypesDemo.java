package dataTypes;

public class DataTypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 10; //Implicit conversion
		b = 127; //Implicit conversion
		b = (byte)128;  //Explicit conversion
		System.out.println(b);
		
		
		int in = 1000000000;
//		in = 10000000000;
		long ln = 10000000000L;
		System.out.println(ln);
		
		
		float f = 3.5f;
		System.out.println(f);
		double db = 6.5;
		System.out.println(db);
		
		in = (int) f;
		System.out.println(in);
		f = in;
		System.out.println(f);
		
		//char
		char ch = 'a';
		ch = 99;
		System.out.println(ch);
//		ch = 64000;
//		System.out.println(ch);
		ch = (char) (ch+2);
		System.out.println(ch);
		in = ch;
		System.out.println(ch);
		ch = (char) 68000;        //out of range of char
		System.out.println(ch);
	}

}
