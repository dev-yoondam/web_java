package classTest;

public class StudentMain {
	public static void main(String[] args) {
		
		Student st1 = new Student();
		System.out.println(st1);
		Student st2 = new Student();
		System.out.println(st2);
		
		st1.name = "김영선";
		st1.math = 90;
		st1.eng = 0;
		st1.kor = 100;
		
		System.out.println(st1.name);
		System.out.println(st1.math);
		
		System.out.println(st2.name);
		System.out.println(st2.math);
		

		//st1의 총합 구하기
		System.out.println(st1.math + st1.eng + st1.kor);
		System.out.println(st1.getTotal());
		System.out.println(st2.getTotal());
		
		//st1의 평균 구하기 메소드 호출
		System.out.println(st1.getAvg());
		
	}
}










