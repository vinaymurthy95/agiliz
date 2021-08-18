package agiliz;

class Balance{
	int amount;
	Balance(int amount){
		this.amount=amount;
	}
}

public class UnCheckedExample {
	public Balance checkAmount(int amount) throws InsufficientFunds{
		if(amount == 0) {
			throw new InsufficientFunds("Account is empty..");
		}
		return new Balance(amount);
	}


	public static void main(String[] args) throws InsufficientFunds {
		UnCheckedExample moneyWithdraw = new UnCheckedExample();
		Balance balance = moneyWithdraw.checkAmount(0);
		

	}

}