package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class LottoMain {
	static void create(HashSet<Integer> set) {
		Random r = new Random();

		for (int i = 0; i < 6; i++) {
			set.add(r.nextInt(45) + 1);
		}
		ArrayList<Integer> result = new ArrayList<>(set);
		Collections.sort(result);
		System.out.println(result);
		set.clear();
	}

	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<>();
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		for (int j = 0; j < num; j++) {
			System.out.print((j + 1) + "회차의 로또 번호 :");
			create(lotto);
		}
	}
}
