package oper;

public class OperTest04 {
	public static void main(String[] args) {
		//비트연산자를 이용한 암호화 복호화
		
		int origin = 42; //원본메시지
		int key = 99; //비트 마스크(암호화 및 복호화에 사용)

		//xor 연산을 통한 암호화
		int encrypte = origin ^ key;
		System.out.println("암호화된 메시지 : " + encrypte);
		int decrypte = encrypte ^ key;
		System.out.println("복호화된 메시지 : " + decrypte);
		
		
	}
}
