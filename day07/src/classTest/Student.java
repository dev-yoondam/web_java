package classTest;

public class Student {
	//필드
	String name;
	int math;
	int eng;
	int kor;
	double avg;
	char grade;
	
	//메소드
	//학생의 총합을 구하는 기능을 가진 메소드
	int getTotal() {
		return math + eng + kor;
	}
	
	//평균을 구하는 기능을 가진 메소드
	//매개변수 x, 리턴값 o
	double getAvg() {
		return getTotal() / 3.0;
	}
	
	
}










