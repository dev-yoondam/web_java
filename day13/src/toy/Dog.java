package toy;

public class Dog extends ToyAdapter{

	@Override
	public String[] speackList() {
		String[] list = { "안녕! 나는 멍멍이야", "배고파요", "멍멍!!", "양치하자!"};		
		return list;
	}

//	@Override
//	public void pushBtn(String speak) {
//		System.out.println(speak);
//	}
	
}
