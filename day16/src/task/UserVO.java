package task;

public class UserVO {
	private String id;
	private String pw;
	private String name;
	private int age;

	// 생섣자
	public UserVO(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}
	// getter 
	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return this.id + this.name + this.age;
	}

}
