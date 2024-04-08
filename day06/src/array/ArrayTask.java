package array;

import java.util.Scanner;

public class ArrayTask {
	public static void main(String[] args) {
		//1. 3명의 학생 java점수를 입력받아 배열에 저장하고
		//평균점수 출력하기
		
		//1) 변수, 배열(int 총합, String 번학생 점수), int 배열3칸 선언
		//2) 입력클래스 import
		//3) 반복문(for문 - 점수 입력받을 반복문 )
		//4) 반복문(for문 - 합계 구할 반복문)
		//5) 평균 출력(총합 / 배열명.length)
		
//		int total = 0;
//		int[] score = new int[3];
//		String msg = "번 학생의 java 점수 : ";
//		Scanner sc = new Scanner(System.in);
//		for(int i = 0; i < score.length; i++) {
//			System.out.println(i + 1 + msg);
//			score[i] = sc.nextInt();
//		}
//		for(int i = 0; i <score.length; i++) {
//			total += score[i];
//		}
//		System.out.println((double)total / score.length);
//		//평균점수 => 실수
//		System.out.println(total / 3.0);
//		System.out.println((double)total / 3);
//		System.out.println((double)(total / 3.0));
//		
		//2. 0, 1, 2, 3, 4, 0, 1, 2, 3, 4 배열에 담고 출력하기
		//단, 칸수를 이용해서 배열 생성
		
		//1) 배열3칸 생성
		//2) 반복문(for {
		//3)  	나머지 연산자를 이용(5개마다 값이 반복됨) }
		//4) 반복문(출력을 위한 for문)
		
		int[] ar1 = new int[10];
		for(int i = 0; i < ar1.length; i++) {
			ar1[i] = i % 5;
		}
		for(int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + " ");
		}
		
		
		//3. A~F까지 중 c만 제외하고 배열에 담고 출력하기
		
		//1) 문자형배열 생성 5칸
		//2) 임시 변수 정수형
		//3) 반복문(for문){
		//4)  임시변수 = i
		//5)  if (i > 1) {
		//6) 	임시변수++; }
		//7)  배열에 값대입 => 배열[i] = (char) (temp+65)
		System.out.println();
		char[] ar2 = new char[5];
		int temp = 0;
		for(int i = 0; i < ar2.length; i++) {
//			System.out.println(i);
			temp = i;
			if(temp > 1) {
				temp++;
			}
			ar2[i] = (char)(temp+65);
		}
//		for(int i = 0; i<ar2.length; i++) {
//			System.out.println(ar2[i]);
//		}
		for(char data : ar2) {
			System.out.println(data);
		}
		
		//4. 5칸의 정수배열을 만들고 입력받아 최대값과 최소값 출력하기
		//1) 정수형 배열 5칸
		//2) 입력 클래스 import
		//3) 변수 String msg; int min, max
		//4) 반복문(for문) - 입력받기 위한 반복문
		//5) min = 배열[0], max = 배열[0]
		//6) 반복문(for문) - 조건문(if문 최소값, if문 최대값)
		//7) 출력
		
		int[] ar3 = new int[5];
		Scanner sc = new Scanner(System.in);
		String msg = "번째 정수 입력 : ";
		for(int i = 0; i < ar3.length; i++) {
			ar3[i] = sc.nextInt();
		}
		int min = ar3[0], max = ar3[0];
		for(int i=0; i < ar3.length; i++) {
			if(min > ar3[i]) {
				min = ar3[i];
			}
			if(max < ar3[i]) {
				max = ar3[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}













