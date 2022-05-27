package bank;

public class LoanTransaction extends Account {
	
	
	int emiAmount;
	Account a;
	
	public void storeData(int accid, int accpin ,int emiAmount) {
		super.storeData(accid, accid, accpin, null, c);
		this.emiAmount = emiAmount;
	}
	public void emiPayment(int accit, int accpin,int emiAmount) {
		System.out.println(emiAmount);
	}
}
