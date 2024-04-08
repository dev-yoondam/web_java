package inheritanceTest;

public class TvMain {
	public static void main(String[] args) {
		//Tv 객체
		Tv tv = new Tv();
		
		//Tv2 객체
		Tv2 tv2 = new Tv2();
		
		//SmartTv 객체
		SmartTv smartTv = new SmartTv();
		
		System.out.println(tv);
		System.out.println(tv2);
		System.out.println(smartTv);
		
		tv.ch = 10;
		tv.chUp();
		
	}
}














