package ex01;
// 윤담 
public class Main {
public static void main(String[] args) {
	School school = new School(); 
	
	// 성적
	int[]ar1 = {85, 90, 95};
	int[]ar2 = {75, 80, 85};
	int[]ar3 = {90, 85, 80};
	Student st1 = new Student("뽀로로",ar1);
	Student st2 = new Student("루피", ar2);
	Student st3 = new Student("짱구", ar3);
	System.out.println(st1);

	// 학생 등록 
	school.registerStudent(st1);
	school.registerStudent(st2);
	school.registerStudent(st3);
	
	school.showStudentList();
	
	school.showScoreAvg();
	
}
}
