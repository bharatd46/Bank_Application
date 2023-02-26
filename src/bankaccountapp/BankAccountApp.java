package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		
		
		/*
		Checking chkacc1 = new Checking("Tom Wilson", "123456789", 1500);
		Savings savacc1 = new Savings("Rich Lowe", "455699992", 2500);
		savacc1.compound();
		savacc1.showInfo();
		System.out.println("----------------------------");
		chkacc1.showInfo();
		*/
		
		//Read a csv file then create new accounts based on that data
		String file = "C:\\Users\\bhara\\OneDrive\\Documents\\Bank.csv";
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			//System.out.println(name + " " +sSN+ " " +accountType+ "$" +initDeposit);
			if(accountType.equals("Savings")) {
				//System.out.println("Open a Savings Account");
				accounts.add(new Savings(name, sSN, initDeposit));
			}
			else if (accountType.equals("Checking")) {
				//System.out.println("Open a Checking Account");
				accounts.add(new Checking(name, sSN, initDeposit));
			}
			else {
				System.out.println("Error Reading Account Type");
			}
		}
		//accounts.get(2).showInfo();
		for(Account acc : accounts) {
			System.out.println("-----------------------");
			acc.showInfo();
		}
	}
}
