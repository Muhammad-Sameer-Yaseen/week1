public class BankAccount{
	private long AccountNo;
	private double Balance;

	public void setAccountNumber(long AccountNo){
		this.AccountNo = AccountNo;
	}

	public void setBalance(double Balance){
		this.Balance = Balance;
	}


	public long getAccountNumber(){
		return AccountNo;
	}

	public double getBalance(){
		return Balance;
	}

	public void deposit(double dep){
		Balance += dep;
	}

	public void Withdraw(double Wd){
		Balance -= Wd;	}

	public void display(){
		System.out.println("Your Bank account number is: " + AccountNo);
		System.out.println("Your Bank balance is: " + Balance);	
	}
}