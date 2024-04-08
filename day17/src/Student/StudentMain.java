package Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();

//	입력클래스 부르고 사용자로부터 학생 수와 점수 받기 (반복문)
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수 입력");
		int stCount = sc.nextInt();

		List<Integer> scores = new ArrayList<>();
		for (int i = 0; i < stCount; i++) {
			System.out.print("학생" + i + 1 + "의 점수 입력 :");
			int score = sc.nextInt();
			scores.add(score);
		}
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	} // ------------------

	static double stAvg(List<Integer> scores) {
		// 총합 구할 변수
		// 반복문 forEach문
		// 총합 구할 변수 += 반복문 변수
		// return 강제형변환

		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		return (double) sum / scores.size();
	}

	static int highScore(List<Integer> scores) {
		int high = Integer.MIN_VALUE;
		for (int score : scores) {
			if (score > high) { // 최저점보다 크면 그 값을 넣어라
				high = score;
			}
		}
		return high;
	}

}
