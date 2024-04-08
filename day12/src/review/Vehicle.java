package review;

//Vehicle 추상 클래스
public abstract class Vehicle {
	//추상메소드
	//move() 이동하는 추상메소드
	public abstract void move();
	
	//setSpeed() 속도 설정 메소드(매개변수 int speed)
	public abstract void setSpeed(int speed);
	
	//getSpeed() 현재 속도 가져오는 메소드
	public abstract int getSpeed();
	
}
