package castingTest2;

public class Employee extends Person {
	// 필드
	String workSpace;

	// 생성자
	public Employee(String name, int age, String job, String workSpace) {
		super(name, age, job);
		this.workSpace = workSpace;
	}

	// 메소드
	// 메소드 오버라이딩
	@Override
	void eat() {
		System.out.println(this.name + "은/는 " + this.workSpace + "에서 밥을 먹는다");
	}

	void walk() {
		System.out.println(this.name + "은/는 " + this.workSpace + "로 출근한다");
	}

}
