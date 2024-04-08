package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListTask {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		Random random = new Random();
		
		if (!(list.contains(list))) {
			for (int i = 0; i < 5; i++) {
				list.add(random.nextInt(50)+1);
				continue;
			}
		}
		Collections.sort(list); // 오름차순 정렬
		System.out.println(list);
		
		while(list.size()<5) {
			if (!(list2.contains(list2))) {
				for (int i = 0; i < 5; i++) {
					list2.add(random.nextInt(50)+1);
					continue;
				}
			}
		} // ----
		Collections.sort(list2);
		System.out.println(list2);
	}
}
