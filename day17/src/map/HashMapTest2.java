package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest2 {
	public static void main(String[] args) {
		HashMap<String, Integer> mart = new HashMap<>();

		// 추가 .put(key, value)
		mart.put("새우깡", 1500);
		mart.put("초코칩쿠키", 2500);
		mart.put("포테토칩", 2500);
		mart.put("칸쵸", 2000);
//      mart.put("칸쵸", 2000);

		System.out.println(mart);

		// 조회 .get(key)
		System.out.println(mart.get("새우깡"));

		// 길이 .size()
		System.out.println(mart.size());

		// containsKey
		System.out.println(mart.containsKey("칸쵸"));
		// containsValue
		System.out.println(mart.containsValue(1500));

		// keySet -> key만 가져오기
		System.out.println(mart.keySet());
		Iterator<String> iter = mart.keySet().iterator();
		System.out.println(iter);
//      System.out.println(iter.hasNext());
//      System.out.println(iter.next());

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		// key와 value를 한쌍씩 가져오기 => Entry
		Set<Entry<String, Integer>> items = mart.entrySet();
		System.out.println("출력끝");
		for (Entry<String, Integer> entry : items) {
			System.out.println(entry);
		}

	}
}
