package set;

import java.util.HashSet;

public class StudentHashTask {
   public static void main(String[] args) {
      // hashSet 객체 생성
      HashSet<Student> set = new HashSet<>();

      // Student 객체 생성
      Student st1 = new Student(1, "김영선");

      // equals 메소드 테스트
      boolean isTrue = st1.equals(new Student(1, "홍길동"));
      System.out.println(isTrue); // equals오버라이딩 전의 기존 출력 false(객체의 주소값으로 비교하기 때문)

      // Student 객체를 HashSet에 추가
      set.add(st1);
      set.add(new Student(1, "홍길동"));
      System.out.println(set.size());

   }
}
