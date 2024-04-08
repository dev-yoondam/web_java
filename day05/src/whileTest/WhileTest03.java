package whileTest;

import java.util.Scanner;

public class WhileTest03 {
	public static void main(String[] args) {
	      //1) 입력클래스 import
	      //2) 숫자 저장할 변수
	      //3) do{
	      //4)    숫자 입력 메시지 출력
	      //5)    변수 nextInt() 사용
	      //6)   조건문(if <= 0) {
	      //7)      양수가 아닙니다 출력 }
	      //8) }while(<= 0)
	      //9) 출력

//		while문으로 바꾸기
	      //1) 입력클래스 import
	      //2) 카운트변수(숫자저장할 변수)
		  //3) while(<=0){
		  //4)   숫자 입력 메시지 출력
	      //5)   변수 nextInt() 사용
	      //6)   조건문(if <= 0) {
	      //7)     양수가 아닙니다 출력 }
		  //8) 출력
		Scanner sc = new Scanner(System.in);
		int number = 0;
		while(number <= 0) {
			System.out.println("숫자 입력 : ");
			number = sc.nextInt();
			if(number <= 0) {
				System.out.println("양수가 아닙니다");
			}
		}
		System.out.println(number + "양수입니다");
	}
}
















