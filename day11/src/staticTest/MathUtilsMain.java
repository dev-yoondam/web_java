package staticTest;

public class MathUtilsMain {
	public static void main(String[] args) {
		//getMax 메소드 호출
		int maxResult = MathUtils.getMax(10, 20);
		System.out.println(maxResult);
		
		//round 메소드 호출
		double roundResult = MathUtils.round(15.66);
		System.out.println(roundResult);
	}
}
