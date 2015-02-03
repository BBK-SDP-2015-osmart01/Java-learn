package genericsandreflection;

public class BankAccount {
	private float balance;

	public void deposit(float amount) {
		balance += amount;
	}

	public float showBalance() {
		return this.balance;
	}

	BankAccount() {
		balance = 100;
	}
}
