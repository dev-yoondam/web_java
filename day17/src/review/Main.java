package review;

public class Main {
	public static void main(String[] args) {
		UserVO u1 = new UserVO("dear-dam", "dam", "윤담", 25);
		UserVO u2 = new UserVO("klimzero", "wooyoung", "유우영", 27);
		UserVO u3 = new UserVO("west-hyeon", "seohyeon", "김서현", 25);
		UserService service = new UserService();
		// toString 오버라이딩해놔서 정보가 나옴
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);

		// 유효성 검사, 회원가입
		// 아이디 중복검사 true 라면, 회원가입 메소드 호출
		if (service.checkId(u1.getId())) {
			service.join(u1);
			System.out.println("가입이 완료되었습니다");
		} else {
			System.out.println("중복된 아이디가 존재합니다");
		}

		u1 = service.login("dear-dam", "am");
		if (u1 != null) {
			System.out.println(u1.getName() + "님 환영합니다");
		} else {
			System.out.println("로그인 실패");
		} // 엥?

	}
}
