package inheritanceTest2;

public class TvMain {
	public static void main(String[] args) {
		Tv tv = new Tv();
		Tv2 tv2 = new Tv2();
		SmartTv st = new SmartTv();
		
		System.out.println(tv);
		System.out.println(tv2);
		System.out.println(st);
		
		tv.chUp();
		tv2.volUp();
		
	}
}
