package control;

import java.util.Scanner;

public class IfTest03 {
   public static void main(String[] args) {
      //if~else if~else문
      //학생의 java 성적을 입력받아서 학점(A+,A,B,C) 계산하기
      //A+ : 100
      //A : 90~99
      //B : 70~89
      //C : 그외
      
      //입력클래스 import
      //출력메시지(입력받을)
      //변수 = 입력메소드 nextInt()
      //조건문(if~else if~else)
      
      Scanner sc = new Scanner(System.in);
      System.out.println("학생의 java 점수 입력 : ");
      int score = sc.nextInt();
      
      if(score == 100) {
         System.out.println("A+");
      }else if(99 >= score && score >= 90) {
         //java에서는 비교연산자를 연속해서 범위를 지정할 수 없다
         //논리연산자를 사용하여 두개의 비교연산을 결합해야한다
         System.out.println("A");
      }else if(89 >= score && score > 69) {
         System.out.println("B");
      }else if(100 < score || score < 0) {
         System.out.println("잘못된 값입니다");
      }else {
         System.out.println("C");
      }
      System.out.println("출력끝");
   }
}