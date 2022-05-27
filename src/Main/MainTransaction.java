package Main;
import bank.*;
import java.util.Scanner;

public class MainTransaction {
	public static void main (String[] args) {
		
		System.out.println("Enter s in saving or l in loantransace");
		Scanner in = new Scanner(System.in);
		String choice = in.next();
		
		if(choice.equals("s")) {
			System.out.println("Enter accont id, account pin");
			int accid = in.nextInt();
			int accpin = in.nextInt();
			
		System.out.println("Withdraw or Deposit???// press w or d");
		String transactiontype = in.next();
		
		switch(transactiontype) {
		case "d":
			SavingTransaction std = new SavingTransaction();
			System.out.println("Enter Deposit Amount: ");
			double dmnt = in.nextDouble();
			std.cashDeposit(accid, accpin, dmnt);
			std.displayDatafordepo();
			break;
			
		case "w":
			SavingTransaction stw = new SavingTransaction();
			System.out.println("Enter Withdraw Amount: ");
			double wamnt = in.nextInt();
			stw.cashWithdraw(accid, accpin, wamnt);
			stw.displayDataforwithdraw();
			break;
		}
		
		}else if (choice.equals("l")) {
			LoanTransaction lt = new LoanTransaction();
			System.out.println("Enter account id, account pin, emiAmount");
			int acct = in.nextInt();
			int accpin = in.nextInt();
			int ea = in.nextInt();
			lt.storeData(acct, accpin, ea);
			lt.displayData();
		}
	}
}