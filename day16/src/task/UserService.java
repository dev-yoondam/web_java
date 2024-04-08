package task;

import java.util.ArrayList;

public class UserService{
	private ArrayList<UserVO> list;
	

	//	메소드 : 아이디 중복검사 메소드
	boolean checkId(String inputId) {
		if(inputId.equals(list)) {
			System.out.println("아이디 중복");
			return false;
		}
		return true;
		
	}
	
//	회원가입 메소드
	boolean regist(UserVO user) {
		if(user.getId().equals(list)) {
			System.out.println("아이디 중복, 회원가입 불가");
			return false;
		}
		list.add(user);
		System.out.println("회원가입 완료");
		return true;
	}
//	로그인 메소드
	void login() {
		
	}
	
}
