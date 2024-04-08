package print;

public class PrintTest02 {
	public static void main(String[] args) {
		System.out.println("printf() 메소드 연습");
		System.out.println("내 java 점수는 100점입니다");
		System.out.printf("내 java 점수는 %d점입니다\n", 100);
		System.out.printf("내 평균점수는 %.1f점입니다\n", 99.55);
		System.out.printf("내 학점은 %c입니다\n", 'A');
		System.out.printf("내 이름은 %s입니다\n", "슈퍼맨");

		//제 이름은 %s이고, 나이는 %d살이고, 취미는 %s입니다
		//printf()
		System.out.printf("제 이름은 \"%s\"이고, 나이는 %d살이고, 취미는 %s입니다.", "김영선", 20, "여행");
	}
}
