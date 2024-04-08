package tvTest;

public class TvMain2 {
	public static void main(String[] args) {
//		Tv2 sTv1 = new Tv2(); //기본생성자가 존재하지 않아 오류 발생
		Tv2 sTv = new Tv2(10, 10, true, "black");
		System.out.println(sTv.ch);
		System.out.println(sTv.power);
		System.out.println(sTv.vol);
		System.out.println(sTv.color);
		//생성자를 사용하면 객체를 만듦과 동시에 내가 원하는 값으로 초기화 할 수 있다
	}
}
