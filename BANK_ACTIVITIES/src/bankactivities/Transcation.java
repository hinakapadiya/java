package bankactivities;

public class Transcation implements BANK_ACC{
	
	public void deposite(Account acc,int amt) {
		
		int newbal = acc.getBalance() + amt;
		
		acc.setBalance(newbal);
		
		System.out.println("AMOUNT DEPOSITED");
				
	}
	
	public void withdraw(Account acc,int amt) {
		
		int newbal = acc.getBalance() - amt;
		
		acc.setBalance(newbal);
		
		System.out.println("SET AMOUNT");		
				
	}
	
}
