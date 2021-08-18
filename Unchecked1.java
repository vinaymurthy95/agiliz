package agiliz;

class Bank
{
	int amount,balance;
	Bank(int x)
	{
		balance=x;
	}
}
public class Unchecked1 {

	public Bank checkAmount(int balance) throws InsufficientFunds
	{
		if(balance == 0) {
			throw new InsufficientFunds("Account is empty..");
		}
		return new Bank(balance);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) throws InsufficientFunds
		{
			
			MoneyWithdraw money = new MoneyWithdraw();
			Bank b=money.checkAmount(0);
			
			
		}

		

	}

}
