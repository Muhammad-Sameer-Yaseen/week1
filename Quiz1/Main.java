public class Main{
	public static void main(String[] args){
		BankAccount a1 = new BankAccount();
		
		a1.setAccountNumber(987654321);
		a1.setBalance(6500);

		a1.deposit(500);
		a1.Withdraw(2000);

		a1.display();
	}
}