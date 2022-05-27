package bank;
import java.util.Scanner;

public class Customer {
	
	int cid,  cAccount;
	String cname;
	public String[] cphone = new String [3];
	
	public void storeData(int cid, String cname,int cAccount, String[] cphone) {
		this.cid = cid;
		this.cname = cname; 
		this.cAccount = cAccount;
		this.cphone = cphone;
	}
	
	public void displayData() {
		System.out.println("Customer Details: ");
		System.out.println("Cid: "+cid+" Cname: "+cname+" Caccount: "+cAccount);
		System.out.println("Cellphone Number:");

		for (int i=0;i<3;i++) {
			System.out.print(cphone[i] + "/ ");
		}
		System.out.println("");
	}
}