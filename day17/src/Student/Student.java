package Student;

import java.util.Scanner;

public class Student {
	int number;
	int score;
	
	public Student(int number2, int score2) {
	}

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수 입력");
		number = sc.nextInt();
		System.out.println("학생 점수 입력");
		score = sc.nextInt();
		
		new Student(number, score);
		
	}
}
