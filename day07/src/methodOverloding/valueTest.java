package methodOverloding;

public class valueTest {
	public static void main(String[] args) {
		valueTest vt = new valueTest();
//		System.out.println(vt);
		
		int num = 1; 	//기본자료형
		int[] arr = {10}; //reference 타입
		
		//변수 자체를 보냄(call by value)
		vt.add_value(num); //101
		System.out.println(num); //1 : 값 변화가 없다
		
		//배열 자체를 보냄(call by reference)
		System.out.println(arr[0]); //1
		vt.add_reference(arr); //110
		System.out.println(arr[0]); //110 : 값이 변화한다
		
		
	}
	
	void add_value(int num) {
		num += 100;
		System.out.println(num);
	}
	
	void add_reference(int[] arNum) {
		arNum[0] += 100;
		System.out.println(arNum[0]);
	}
}











