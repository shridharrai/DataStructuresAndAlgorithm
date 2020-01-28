package functions;

public class FunctionDemo {
	public static int val = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(val);
		int val = 200;
		System.out.println(val);    //Local variable wins
		System.out.println(FunctionDemo.val);   //To use global variable
		int sum = DemoGlobalScope(val);
		System.out.println(sum);
		
		//Pass by value
		System.out.println("Pass By Value");
		int a = 10;
		int b = 20;
		System.out.println(a + "," + b);
		swap(a,b);
		System.out.println(a+ "," + b);
	}
	
	public static void swap(int a , int b) {
		System.out.println(a+ "," + b);
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println(a+ "," + b);
	}
	
	public static int DemoGlobalScope(int one) {
		int sum = one + val;    //Here global variable is used
		return sum;
	}

}
