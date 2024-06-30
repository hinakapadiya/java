package bankactivities;

public class TEST_Tranctions extends Transcation implements BANK_ACC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account();
		
		acc.setAccname("Leela Rathod");
		acc.setEmail("leela@gmail.com");
		acc.setBalance(15000);
		
		Transcation tc = new Transcation();
		
		tc.deposite(acc,2000);
		
		System.out.println(acc);
		
		tc.withdraw(acc, 500);
		
		System.out.println(acc);
				
	}

}
