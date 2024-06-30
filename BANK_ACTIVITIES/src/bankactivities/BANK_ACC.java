package bankactivities;

public interface BANK_ACC extends BASEBANK {
	
	int MIN_BAL = 1000;
	int DEPOSITE_LIMIT = 25000;
	int WITHDRAW_LIMIT = 10000;
	
	void deposite(Account acc,int amt);
	void withdraw(Account acc,int amt);

	
}