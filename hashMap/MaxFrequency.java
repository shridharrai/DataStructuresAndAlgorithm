package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MaxFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabbaaabcdda";
		System.out.println(getMaxFreq(str));
	}

	public static char getMaxFreq(String str) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); ++i) {
			char cc = str.charAt(i);
			if (map.containsKey(cc)) {
				int ov = map.get(cc);
				int nv = ov + 1;
				map.put(cc, nv);
			} else {
				map.put(cc, 1);
			}
		}
		
		char maxchar = '\0';
		int max = 0;
		Set<Map.Entry<Character, Integer>> entries = map.entrySet();
		for (Map.Entry<Character, Integer> entry : entries) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				maxchar = entry.getKey();
			}
		}
		
		return maxchar;
	}

}
