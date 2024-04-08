package input;

import java.util.Scanner;

public class InputTest04 {
	public static void main(String[] args) {
		//좋아하는 숫자 num	=> nextInt()
		//좋아하는 동물 animal => nextLine()
		int num = 0;
		String animal = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("좋아하는 숫자를 입력하세요 : ");
		num = sc.nextInt();
		System.out.println("좋아하는 동물을 입력하세요 : ");
		sc.nextLine();
		animal = sc.nextLine();
		System.out.println("좋아하는 숫자는 " + num + ", "
				+ "좋아하는 동물은 " + animal + "입니다");
		
	}
}











