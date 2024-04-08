package map;

import java.util.HashMap;

public class HashMapTest1 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();

		System.out.println(map); // {}

		// 추가 : put(key, value);
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);

		System.out.println(map); // {A=1, B=2, C=3, D=4}

		System.out.println(map.put("A", 5)); // 해당 키값이 이미 존재해서 값이 바뀜
		// A에 연관된 값이 있어서 value를 반환한 것 // 1
		System.out.println(map);

		System.out.println(map.get("B")); // 2 : 해당key(B)의 value 가져옴
		System.out.println(map.keySet()); // key만 출력 , [A, B, C, D]
		System.err.println(map.values()); // [5, 2, 3, 4]

	}
}
