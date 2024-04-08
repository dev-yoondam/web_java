package oper;

public class OperTest02 {
	public static void main(String[] args) {
		//복합대입연산자(누적연산자)
		//산술연산자, 대입연산자를 같이 쓸 때 말한다
		
//		int num = 1;
//		System.out.println(num);
//		num = num + 10;
//		System.out.println(num);
//		num += 10; 
//		System.out.println(num);
//		int num1 = 5;
//		System.out.println(num1);
//		System.out.println("현재 num1의 값 : " + num1);
//		num1 -= 3; // num1 = num1 - 3
//		System.out.println("현재 num1의 값 : " + num1);
//		num1 *= 25; // num1 = num1 * 25
//		System.out.println("현재 num1의 값 : " + num1);
		
//		int money = 10000;
//		//커피 2000원
//		money = money - 2000; // money -= 2000
//		//빵 2500원
//		money -= 2500;
//		System.out.println(money);
//		//50000원 입금
//		money += 50000;
//		System.out.println(money);
		
		//1씩 증가, 1씩 감소
		int data = 10;
//		data = data + 1;
//		data += 1;
		data++;
		System.out.println(data);
//		System.out.println(++data);
//		System.out.println(data++); //11
		System.out.println(--data);
		System.out.println(data--);
		System.out.println(data);
		
		int x = 1;
		System.out.println(x++);
		System.out.println(x);
		System.out.println(--x);
		System.out.println(x++ + --x + 2);
		
	}
}



















