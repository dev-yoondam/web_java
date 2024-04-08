package tvTest;

public class TvMain {
	public static void main(String[] args) {
		//Tv 객체
		Tv samsungTv = new Tv();
		System.out.println(samsungTv);
		
		System.out.println(samsungTv.ch);
		System.out.println(samsungTv.power);
		samsungTv.ch = 10;
		samsungTv.vol = 15;
		samsungTv.powerOnOff();
		samsungTv.chUp();
		//객체에 값을 저장하는 방법이 불편하다. 이럴 때 생성자를 이용한다.
	}
}
