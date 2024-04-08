package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class T_lotto {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.println("몇회차 로또 번호를 생성하시겠습니까? ");
      int count = sc.nextInt();

      // 메소드 호출
      for (int i = 1; i <= count; i++) {
         HashSet<Integer> lotto = lottoNum();

         // 오름차순 정렬
         ArrayList<Integer> result = new ArrayList<>(lotto);
         Collections.sort(result);
         System.out.println(i + "회차 로또번호 : " + result);
      }

   }

   // 1~45까지의 숫자 중 6개의 서로 다른 숫자를 무작위로 선택하여 반환하는 메소드
   static HashSet<Integer> lottoNum() {
      Random r = new Random();
      HashSet<Integer> lotto = new HashSet<>();
      while (lotto.size() < 6) {
         int number = r.nextInt(45) + 1;
         lotto.add(number);
      }
      return lotto;
   }

}
