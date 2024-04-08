package review;

import java.util.ArrayList;

public class UserService {
	private ArrayList<UserVO> userList = new ArrayList<>();

	// id 중복검사
	public boolean checkId(String id) {
		// 모든 회원정보를 하나씩 가져와서 새로운 변수에 담아줌 (for-each)
		// 변수에 담긴 id값고 매개변수를 비교 (equals)

		for (UserVO user : userList) {
			if (user.getId().equals(id)) {
				return false;
			}
		}
		return true;

	}

	// 회원가입
	public void join(UserVO user) {
		userList.add(user);
	}

	// 로그인
	public UserVO login(String id, String pw) {
		// userList의 값을 변수에 하나씩 복사
		// 조건 확인 (if문)
		// id동일, pw동일해야 로그인 성공
		for (UserVO user : userList) {
			if (user.getId().equals(id) && user.getPw().equals(pw)) {
				return user;
			}
		}
		return null;
	}

}
