package set;

public class Student {
   // 필드
   int number;
   String name;

   // 생성자
   public Student(int number, String name) {
      super();
      this.number = number;
      this.name = name;
   }

   // 메소드
   // equals 메소드 재정의
   // equals(Object obj) : 객체의 동등성을 비교
   // 1) if 객체가 자기 자신과 같은지를 검사하고, 2) 그렇지 않은경우 obj가 Student클래스의 인스턴스인지 확인하고
   // 번호를 기준으로 두 객체를 비교하여 동등한지 여부를 반환
   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj instanceof Student) {
         return this.number == ((Student) obj).number;
      }
      return false;
   }

   // hashCode 메소드 재정의
   // 객체의 해시코드를 반환
   // 번호를 기준으로 한 해시코드를 생성하여 반환
   // 주로 해시 맵(Hash Map)과 같은 자료구조에서 객체를 저장하고 검색하는데 사용
   @Override
   public int hashCode() {
      return this.number;
   }

}
