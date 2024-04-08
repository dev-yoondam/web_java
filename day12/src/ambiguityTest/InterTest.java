package ambiguityTest;

public class InterTest implements Inter1, Inter2, Inter3{

	@Override
	public void printText() {
			Inter2.super.printText();
	}
	
	public static void main(String[] args) {
		InterTest it = new InterTest();
		it.printText();
	}

}
