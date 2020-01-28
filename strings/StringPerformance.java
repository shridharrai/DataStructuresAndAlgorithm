package strings;

public class StringPerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
//		appendString(100000);
		appendStringSB(1000000);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	
	public static void appendString(int n) {
		String s = " ";
		for (int i = 1; i <= n; i++) {
			s = s+i;
		}
	}
	
	public static void appendStringSB(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			sb.append(i);
		}
	}

}
