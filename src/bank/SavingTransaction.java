package bank;

public class SavingTransaction extends Account {

	public double amountToDeposit, amountToWithdraw;
	
	public void cashDeposit(int accid, int accpin,double aTD) {
		this.accid = accid;
		this.accpin = accpin;
		this.amountToDeposit = aTD;
	}
	public void cashWithdraw(int accid, int accpin, double aTW) {
		this.accid = accid;
		this.accpin = accpin;
		this.amountToWithdraw = aTW;
	}
	public void accountDetails(int accid) {
	
	}	
	public void displayDatafordepo() {
		System.out.println("Accid: "+accid+" Accpin: "+accpin+""+" DepoAmount: "+amountToDeposit);
	}
	public void displayDataforwithdraw() {
		System.out.println("Accid: "+accid+" Accpin: "+accpin+""+" WithdrawAmount: "+ amountToWithdraw);
	}
}