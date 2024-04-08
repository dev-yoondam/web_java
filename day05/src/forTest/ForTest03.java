package forTest;

public class ForTest03 {
	public static void main(String[] args) {
//		//초기식 : int i = 0
//		
//		//1~100 짝수만 출력 tab키 적용
////		1) for( 초기식 : int i = 0;
////			조건식 : i <= 100; or i <= 50;
////			증감식 : i++		or 	i += 2
////		2) 조건문	 if	(i% 2== 0 && i != 0) or	(if i != 0)
////		3)		출력문(print(i + "\t")
//		
//		for(int i = 0; i <= 50; i+=2) {
//			if(i != 0) {
//				System.out.println(i*2);
//			}
//		}
//	
//		//A~F 출력
////		for(char c = 'A'; c <= 'F'; c++) {
////			System.out.println(c);
////		}
//		int al = 'F'; //65~70
//		System.out.println(al);
//		for(int i = 0; i < 6; i++) {
//			System.out.println((char)(i+65));
//		}
		
		//aBcDeFgHiJkLmNoPqRsTuVwXyZ 출력
		for(int i = 0; i < 26; i++) {
//			if(i % 2 == 0) {
//				System.out.print((char)(i+97));
//			}else {
//				System.out.print((char)(i+65));
//			}
			System.out.print((char)(i % 2==0? i+97:i+65));
		}
	}
}











