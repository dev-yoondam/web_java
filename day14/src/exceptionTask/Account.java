package exceptionTask;

public class Account {
//은행계좌 클래스
	
//필드 : 잔고 balance private
	private int balance;
//생성자 : 기본생성자 추가
	public Account() {
		super();
	}
	
//게터, 세터 메소드
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
//출금메소드 : withdraw 매개변수 1개
//	잔액보다 출금금액이 크다면 출금불가 예외처리/현재 잔고는 _원입니다. 출금금액의 _원이 부족하여 출금이 불가능합니다 출력
	void withdraw(int amount) throws MyException{
		if(balance < amount) {
			throw new MyException("출금이 불가능합니다. 현재 잔고는 "+ this.balance + "원이며, 출금금액의 " 
		+ (amount-this.balance) + "원이 부족합니다");
		}else {
			balance -= amount;
			System.out.println(amount + "원이 출금되었습니다. 현재 잔고는 "+ this.balance +"입니다");
		}
	}

	
//입금메소드 : deposit 매개변수 1개
//	잔액에 입금된 금액 추가후 입금된 금액은 _원입니다. 현재 잔고는 _원입니다. 출력
	void deposit(int amount) {
		balance += amount;
		System.out.println(amount +"원이 입급되었습니다. 현재 잔고는 " + this.balance + "입니다");
	}
		
//	모든 예외처리는 메소드를 사용하는 쪽으로 던지기

	//AccountMain클래스
//	메인메소드
//	입금메소드 호출
//	출금메소드 호출
	
	
//	사용자 예외 정의 클래스
//	MyException extends Exception
	
}
