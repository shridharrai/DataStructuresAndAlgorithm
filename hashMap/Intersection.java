package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] one = {5, 1, 3, 4, 7};
		int[] two = {2, 4, 3, 5, 7, 10, 15};
		ArrayList<Integer> list = getIntersection(one, two);
		System.out.println(list);
	}

	public static ArrayList<Integer> getIntersection(int[] one, int[] two) {
		// TODO Auto-generated method stub
		HashMap<Integer, Boolean> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < one.length; i++) {
			map.put(one[i], false);
		}
		
		for (int j = 0; j < two.length; j++) {
			if (map.containsKey(two[j])) {
				map.put(two[j], true);
			}
		}
		
		Set<Map.Entry<Integer, Boolean>> entries = map.entrySet();
		for (Map.Entry<Integer, Boolean> entry : entries) {
			if (entry.getValue()) {
				list.add(entry.getKey());
			}
		}
		
		return list;
	}

}
