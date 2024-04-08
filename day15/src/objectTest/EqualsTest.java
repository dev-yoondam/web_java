package objectTest;

public class EqualsTest {
	public static void main(String[] args) {

		User user1 = new User(2, "철수");
		User user2 = new User(2, "짱구");

		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user1 == user2);
		System.out.println(user1.equals(user2));
	
		// 유저번호가 같다면 같은 유저로 판단한다

		NewUser nu1 = new NewUser(1, "짱구");
		NewUser nu2 = new NewUser(1, "철수");
		System.out.println(nu1);
		System.out.println(nu2);
		System.out.println(nu1 == nu2);
		System.out.println(nu1.equals(nu2));
		System.out.println(nu1.equals(new NewUser(1, "유리")));
		// 해쉬코드 값 확인
		System.out.println(nu1.hashCode());
		System.out.println(nu2.hashCode());
		System.out.println(user1.hashCode());
		System.out.println(user2.hashCode());
	}
}
