package ex01;

// 윤담 
public class School {
	Student[] students;
	int studentCount;

	public School() {
		super();
		this.students = new Student[30];
		this.studentCount = 0;
	}

	// 학생등록
	// 학생번호는 학생 등록할 때 지정되어야 함. student 객체로 studentNumber에 studentCount 대입
	// 학생배열[현재 학생번호]에 학생객체를 대입해줌
	// studentCount는 다음에 새 학생이 들어올때마다 올라가게 증가연산자로 ++해준 후 true 반환
	boolean registerStudent(Student student) {
		if (studentCount > 29) {
			return false;
		}

		student.studentNumber = studentCount;
		this.students[studentCount] = student;
		studentCount++;
		System.out.println("학생을 등록했습니다");
		return true;
	}

	// 학생보기
	// Student타입 객체 생성, 이 객체에 Student클래스의 index별 각 객체주소값이 들어가게 해줌
	// for문으로 index별로 student의 showGradeInfo() 메소드가 호출되게 해줌
	void showStudentList() {
		System.out.println("===학생 목록===");
		Student st = null;
		for (int i = 0; i < students.length; i++) {
			st = students[i];
			if (st == null) {
				break;
			}
			st.showGradeInfo();
		}
		System.out.println("==========================");
	}

	// 성적보기
	// 학생 수 넘기면 멈추게 break 를 if문에 넣어서 해줌
	// for문으로 index별로 student의 scoreAvg() 메소드가 호출되게 해줌/
	// 아 학생!! 은 그냥 st해서 객체별로 st.studentName해서 호출
	void showScoreAvg() {
		System.out.println("===성적 평균===");
		for(int i=0; i<students.length;i++) {
			Student st = students[i];
			if(st == null) { break;}
			System.out.println("학생이름 :"+ st.studentName + ", 평균 성적 :" + st.scoreAvg());
		}
		System.out.println("==========================");
	}

}
