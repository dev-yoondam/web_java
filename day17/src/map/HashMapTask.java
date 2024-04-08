package map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTask {
	public static void main(String[] args) {
		HashMap<String, Integer> cafe = new HashMap<>();
//  카페메뉴
//  아메리카노 2000원
//  카페라떼 2500원
//  바닐라라떼 4000원
//  초코라떼 4000원
		cafe.put("아메리카노", 2000);
		cafe.put("카페라떼", 2500);
		cafe.put("바닐라라떼", 4000);
		cafe.put("초코라떼", 4000);

//  HashMap에 저장하기
//  출력과 입력
//  1. 아메리카노
//  2. 카페라떼
//  3. 바닐라라떼
//  4. 초코라떼
//  번호를 선택하세요 : 2
//  카페라떼의 가격은 2500원 입니다
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 아메리카노\n2. 카페라떼\n3. 바닐라라떼\n4. 초코라떼");

		// while문으로 번호 계속 입력받게함
		// if문으로 입력받은 번호에 맞게 매칭, 가격은 cafe.get()해서 키 입력해서 값 받아옴
		// 0입력하면 break
		while (true) {
			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("아메리카노의 가격은" + cafe.get("아메리카노") + "원 입니다");
			} else if (num == 2) {
				System.out.println("카페라떼의 가격은" + cafe.get("카페라떼") + "원 입니다");
			} else if (num == 3) {
				System.out.println("바닐라라떼의 가격은" + cafe.get("바닐라라떼") + "원 입니다");
			} else if (num == 4) {
				System.out.println("초코라떼의 가격은" + cafe.get("초코라떼") + "원 입니다");
			} else if (num == 0) {
				break;
			} else {
				System.out.println("다시입력");
			}
		}

		// 7-2) 선택한 번호에 따라 메뉴를 출력
		// memuName = "아메리카노";

		// 8-2) memuName + "의 가격은" + memu.get(memuName)

		HashMap<String, Integer> menu = new HashMap<>();
		menu.put("아메리카노", 2000);
		menu.put("카페라떼", 2500);
		System.out.println(menu);
		System.out.println(menu.keySet());

		System.out.println("전체메뉴");
		for (String menuName : menu.keySet()) {
			System.out.println(menuName + "의 가격은 " + menu.get(menuName) + "입니다");
		}

	}
}
