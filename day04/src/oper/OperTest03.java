package oper;

public class OperTest03 {
	public static void main(String[] args) {
		System.out.println(10&11);
		System.out.println(10|11);
		System.out.println(10 ^ 11);
		System.out.println(~10);
		System.out.println(~12);
		//~a = -a-1
		
		System.out.println("십진수 : " + 10 + ", 이진수 : " + Integer.toBinaryString(10));
		System.out.println("십진수 : " + 11 + ", 이진수 : " + Integer.toBinaryString(11));
		System.out.println("이진수 : " + Integer.toBinaryString(10&11));
		System.out.println("이진수 : " + Integer.toBinaryString(~10));
		System.out.println("이진수 : " + Integer.toBinaryString(10));
		
		System.out.println("=========");
		//shift 연산자
		System.out.println(10 << 2);
		System.out.println(10 >> 2);
		System.out.println("이진수 : " + Integer.toBinaryString(10 << 2));
		System.out.println("이진수 : " + Integer.toBinaryString(10 >> 2));
	
	
	}
}













