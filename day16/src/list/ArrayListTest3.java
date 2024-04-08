package list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest3 {
   public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();

      for (int i = 0; i < 10; i++) {
         list.add((10 - i) * 10);
      }
      System.out.println(list);

      // Collections 클래스 : 컬렉션 프레임워크와 관련된 여러 메소드를 가지고있다
      // 일부 알고리즘도 구현해놓았다
      // static 메소드로 구현했기 때문에 객체를 만들 필요가 없다

      Collections.sort(list); // 오름차순정렬
      System.out.println(list);
      // 내림차순 정렬(큰값->작은값)
      Collections.sort(list, Collections.reverseOrder());
      System.out.println(list);

//      Comparable는 자바에서 객체를 비교하고 정렬하는데 사용되는 인터페이스
//      comparable(T o1, T o2) : 두 개의 객체 o1과 o2를 비교하는 메소드
//      o1이 o2보다 작으면 음수를, o1이 o2보다 크면 양수를, 두객체가 같으면 0을 반환한다
//      메소드를 구현하여 두 객체를 비교하는 비교 규칙을 정의할 수 있다

//      .equals(Object obj) : 두 객체의 동등성 비교 메소드

      Collections.shuffle(list); // 섞기
      System.out.println(list);

      Collections.reverse(list); // 현재 값들을 반대로 뒤집기(정렬아님)
      System.out.println(list);

      System.out.println(Collections.max(list));
      System.out.println(Collections.min(list));

   }
}
