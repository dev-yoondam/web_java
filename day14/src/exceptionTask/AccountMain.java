package exceptionTask;

public class AccountMain {
	public static void main(String[] args) {
		Account account = new Account();
		
		//try~catch : alt + shift + z 단축키
		try {
			account.deposit(50000); //입금
			account.withdraw(10000); //출금
			account.withdraw(50000); //출금
		} catch (MyException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}	
	}
}
