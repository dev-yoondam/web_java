package set;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetTest3 {
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<>();
	
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	
	System.out.println(list.size()); // 15
	System.out.println(list); //[1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]
	
	HashSet<Integer> set = new HashSet<>(list); // 생성자에 list 객체 추가 
	System.out.println(set); //[1, 2, 3, 4, 5]
	
	ArrayList<Integer> result = new ArrayList<Integer>(set);
	System.out.println(result); //[1, 2, 3, 4, 5]
}
}
