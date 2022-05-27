package Main;

import bank.*;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Press s if Savingsaccount || l if LoanAccount");
		String choice = in.next();
			
			if (choice.equals("s")) {
				
				Customer newCus = new Customer();
				System.out.println("Enter cid,cname,cAccount");
				int cid = in.nextInt();
				String cname = in.next();
				int cAccount = in.nextInt();
				System.out.println("Give first three Contact no.# of customer: ");
				for(int i =0;i<3;i++) {
				newCus.cphone[i] = in.next();}
				newCus.storeData(cid, cname, cAccount, newCus.cphone);
				
				Address newAdd = new Address();
				System.out.println("Enter street, state, country, pincode");
				String street= in.next();
				String state = in.next();
				String country = in.next();
				int pincode= in.nextInt();
				newAdd.storeData(street, state, country, pincode); 
				
				Account acct = new Account();
				System.out.println("Enter accid, accbalance, accpin");
				int accid = in.nextInt();
				int accbalance=in.nextInt();
				int accpin=in.nextInt();
				acct.storeData(accid,accbalance,accpin,newAdd,newCus);
				
				SavingAccount  sa = new SavingAccount();
				System.out.println("Enter InterestReceived, OverDraft");
				int IR = in.nextInt();
				int OR = in.nextInt();
				sa.storeData(acct, IR, OR);
				sa.displayData();

			}
			else if(choice.equals("l")) {
				
				Customer newCus = new Customer();
				System.out.println("Enter cid,cname,cAccount");
				int cid = in.nextInt();
				String cname = in.next();
				int cAccount = in.nextInt();
				System.out.println("Give first three Contact no.# of customer: ");
				for(int i =0;i<3;i++) {
				newCus.cphone[i] = in.next();}
				newCus.storeData(cid, cname, cAccount, newCus.cphone);
				
				Address newAdd = new Address();
				System.out.println("Enter street, state, country, pincode");
				String street= in.next();
				String state = in.next();
				String country = in.next();
				int pincode= in.nextInt();
				newAdd.storeData(street, state, country, pincode); 
				
				Account acct = new Account();
				System.out.println("Enter accid, accbalance, accpin");
				int accid = in.nextInt();
				int accbalance=in.nextInt();
				int accpin=in.nextInt();
				acct.storeData(accid,accbalance,accpin,newAdd,newCus);
				
				LoanAccount la = new LoanAccount();
				System.out.println("Enter PrincipalLoanAmount, MonthlyEmi, TotalLoanDuration, InterestApplied");
				int PA = in.nextInt();
				int ME = in.nextInt();
				int TD = in.nextInt();
				int IA = in.nextInt();
				la.storeData(acct, newAdd, PA, ME, TD, IA);
				la.displayData();
		}
	}
}