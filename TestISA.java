class Account
{
	int id;
	String name;
	double balance;
	void deposit(){
		System.out.println("Account Deposit Call");
	}
	void withDraw(){
		System.out.println("Account WithDraw Call");
	}
	void openAccount(){
		System.out.println("Account Open Call");
	}
}
class SavingAccount extends Account{
	@Override
	void withDraw(){
		super.withDraw();
		System.out.println("Saving Account WithDraw 50K Limit");
	}
	void roi(){
		System.out.println("Saving Account ROI is 4%");
	}
}
class CurrentAccount extends Account{
	void odLimit(){
		System.out.println("Current Account OD Limit is 2 Lakh...");
	}
}
public class TestISA {
	void caller(Account account){
		double tt = 100.20;
		int hh = (int)tt;
		account.openAccount();
		account.deposit();
		account.withDraw();
		if(account instanceof SavingAccount){
			SavingAccount sa = (SavingAccount) account ; // Downcasting
			sa.roi();
		}
		else
		if(account instanceof CurrentAccount){
			CurrentAccount ca = (CurrentAccount) account;
			ca.odLimit();
		}
		System.out.println("*****************************");
	}
	public static void main(String[] args) {
		TestISA obj = new TestISA();
		obj.caller(new SavingAccount());
		obj.caller(new CurrentAccount());
		// IS - A Code Reuse
//		Account account = new SavingAccount(); //Upcasting
//		account.openAccount();
//		account.deposit();
//		account.withDraw();
//		//account.roi();
//		
//		account = new CurrentAccount();
//		account.openAccount();
//		account.deposit();
//		account.withDraw();
		//account.odLimit();
		
		/*SavingAccount sa  = new SavingAccount();
		sa.openAccount();
		sa.deposit();
		sa.withDraw();
		sa.roi();
		
		System.out.println("***********************");
		CurrentAccount ca = new CurrentAccount();
		ca.openAccount();
		ca.deposit();
		ca.withDraw();
		ca.odLimit();*/

	}

}
