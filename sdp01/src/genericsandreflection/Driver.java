package genericsandreflection;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Storage<BankAccount> aStorage = new Storage<>();
		Storage<String> sStorage = new Storage<>();

		Class<BankAccount> baCls = BankAccount.class;
		try {
			BankAccount myAccount = (BankAccount) baCls.newInstance();
			aStorage.setValue(myAccount);
			// deposit
			myAccount.deposit(15);
		} catch (IllegalAccessException ex ) {
			throw new RuntimeException(ex);
		} catch (InstantiationException ex ) {
			throw new RuntimeException(ex);
		}
		
		System.out.println(aStorage.getValue().showBalance());
		
		if (aStorage.getClass() == sStorage.getClass()) {
			System.out.println("EQUAL");
		} else {
			System.out.println("NOT EQUAL");
		}
	}

}
