package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println(al); // [], 추가된게 없어서 대괄호로
		System.out.println(al.toString()); // []
		// ArrayList 클래스의 객체를 출력시 [] 로만 출력되는 이유 :
		// toString()이 오버라이딩 되어있음

		al.add(5);
		al.add(9);
		al.add(7);
		al.add(34);
		System.out.println(al); // [5, 9, 7, 34]

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		// <Element> : 제네릭

		// Integer로만 넣어주겠다
		ArrayList<Integer> al1 = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			al1.add((10 - i) * 10);
		}
		System.out.println(al1); // [100, 90, 80, 70, 60, 50, 40, 30, 20, 10]

		// 빠른 for문
		for (int data : al1) { // auto unboxing
			System.out.println(data); // 정수타입으로 오토언박싱
		}
		// 배열을 빠른 for문
		for (int data : new int[] { 1, 2, 3, 4, 5 }) {
			System.out.println(data);
		}

		ArrayList<List> ll = new ArrayList<>();
		// 자기자신의 객체를 넣으면 .this collection 이 나온다
		ll.add(ll);
		System.out.println(ll); // [(this Collection)]

	}
}
