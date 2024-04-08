package studentTest;

public class Main {
	public static void main(String[] args) {
		Student st1 = new Student("김영선", "컴공", 20, 2);
		System.out.println(st1);
		System.out.println(st1.score);
		
		//메소드 호출 -> 학점 출력
		double avg = st1.avgScore(33, 44);
		System.out.println(avg);
		
		System.out.println(st1.gradeScore(avg));
		System.out.println(st1.score);
		
	}
}
