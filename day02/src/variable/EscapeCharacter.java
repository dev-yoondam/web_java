package variable;

public class EscapeCharacter {
	public static void main(String[] args) {
//		//\n : 줄바꿈
//		System.out.println("안녕하세요.\n반갑습니다.");
//		
//		//\t : 일정간격 띄우기(tab)
//		System.out.println("안녕하세요.	오늘은 3월 11일입니다.");
//		System.out.println("안녕하세요.\n\t오늘은 3월 11일입니다.");
		
		// \", \' : 강조표현시 주로 사용
		System.out.println("김영선은 \"웹개발 공부\"를 열심히 합니다");
		System.out.println("저는 '취업'을 꼭 할 겁니다!!");
		System.out.println("저는 \'취업\'을 꼭 할 겁니다!!");
		System.out.println('\'');
		
		// \\ : 역슬래쉬 표현
		System.out.println("제어문자를 사용할 때는 \\를 이용한다");
	}
}
