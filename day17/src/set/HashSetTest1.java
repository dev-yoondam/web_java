package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest1 {
	public static void main(String[] args) {
		HashSet<String> animalSet = new HashSet<>();
		animalSet.add("고양이");
		animalSet.add("강아지");
		animalSet.add("토끼");
		animalSet.add("도롱뇽");
		animalSet.add("카피바라");
		animalSet.add("기니피그");
		animalSet.add("기니피그"); // 중복 안돼서 이건 안 들어감

		System.out.println(animalSet); // [카피바라, 고양이, 토끼, 도롱뇽, 기니피그, 강아지] 순서엉망

		// 내가 저장한 순서대로 값이 저장되어있는가? x
		// 특정 값을 가져올 수 있는가? x
		// HashSet은 값을 가져올 수 없다. 그런데 어떻게 toString()으로는 값을 가져오는가?
		// 다른 자료구조로 값을 변환해서 가져와야한다
		
		Iterator<String> animalIter = animalSet.iterator();
		
		System.out.println(animalIter); //java.util.HashMap$KeyIterator@515f550a
		
		System.out.println(animalIter.hasNext()); //animalSet 기준으로, 다음 값의 유무 확인
		System.out.println(animalIter.hasNext()); // 현재론 계속 true나옴 
		
//		System.out.println(animalIter.next()); // 카피바라
//		System.out.println(animalIter.next()); // 고양이
//		System.out.println(animalIter.next()); // 토끼
//		System.out.println(animalIter.next()); // 도롱뇽
//		System.out.println(animalIter.next()); // 기니피그
		
		while(animalIter.hasNext()) {
			System.out.print(animalIter.next() + ","); // 카피바라,고양이,토끼,도롱뇽,기니피그,강아지,
		}
		
		
	}
}
