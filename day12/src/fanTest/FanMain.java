package fanTest;

public class FanMain {
	public static void main(String[] args) {
		FanMain fm = new FanMain();
		fm.method(new BasicFan());
		fm.method(new BasicFan2());
		fm.method(new SmartFan());
	}
	
	void method(Fan fan) {
		fan.on();
		fan.off();
		fan.turbo();
	}
}
