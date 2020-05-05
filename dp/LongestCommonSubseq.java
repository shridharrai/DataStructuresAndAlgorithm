package dp;

public class LongestCommonSubseq {
	//O(2^(s1.length+s2.length))
	public static int lcs(String str1, String str2) {
		if (str1.length() == 0 || str2.length() == 0) {
			return 0;
		}
		int count = 0;
		String ros1 = str1.substring(1);
		String ros2 = str2.substring(1);
		
		if (str1.charAt(0) == str2.charAt(0)) {
			count = 1 + lcs(ros1, ros2);
		} else {
			int f1 = lcs(str1, ros2);
			int f2 = lcs(str2, ros1);
			count = Math.max(f1, f2);
		}
		return count;
	}
	
	//O((s1.length+1)(s2.length+1))
	public static int lcsI(String s1, String s2) {
		int[][] strg = new int[s1.length()+1][s2.length()+1];
		//seed
		strg[s1.length()][s2.length()] = 0;
		
		for (int i = s1.length(); i >= 0; i--) {
			for (int j = s2.length(); j >= 0; j--) {
				if (i==s1.length() || j==s2.length()) {
					strg[i][j] = 0;
					continue;
				}
				
				if (s1.charAt(i) == s2.charAt(j)) {
					strg[i][j] = 1+strg[i+1][j+1];
				} else {
					strg[i][j] = Math.max(strg[i+1][j], strg[i][j+1]);
				}
			}
		}
		
		return strg[0][0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abbg";
		String str2 = "agbg";
		System.out.println(lcs(str1, str2));
		System.out.println(lcsI(str1, str2));
	}

}
