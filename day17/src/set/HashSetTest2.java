package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest2 {
	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();

		set.add("java");
		set.add("dbms");
		set.add("jdbc");
		set.add("jsp");
		set.add("spring boot");

		System.out.println(set); // [spring boot, java, jsp, dbms, jdbc]

		// remove(Object o) : 업캐스팅, 래퍼클래스타입
		// 매개변수로 지정된 요소를 세트에서 제거함
		set.remove("java");
		System.out.println(set); // [spring boot, jsp, dbms, jdbc]

		// contains(Object o) : 지정된 요소가 세트에 있니
		System.out.println(set.contains("jdbc")); // true
		System.out.println(set.contains("spring boot")); // true

		// size() : 세트의 요소개수 반환
		System.out.println(set.size()); // 4

		// isEmpty() : 세트가 비어있는지 확인
		System.out.println(set.isEmpty()); // 비어있지 않아서 false

//		// clear() : 세트 모든 요소 삭제
//		set.clear();
//		System.out.println(set.isEmpty()); // 비어있어서 true

		// 반복자 Iterator : 세트의 요소에 대한 반복자를 반환, 반복자를 사용하여 세트의 요소를 반복할 수 있다
		Iterator<String> iter = set.iterator();

		while (iter.hasNext()) { // 다음값이 있니?
			System.out.println(iter.next()); // 다음 값을 가져오는 메소드
		}

	}
}
