package test;

import java.util.Arrays;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		List<String> name = Arrays.asList("고태민", "장윤근", "한지윤");
		
		System.out.println(name);
		name.forEach(a -> System.out.println(a));
	}
}
