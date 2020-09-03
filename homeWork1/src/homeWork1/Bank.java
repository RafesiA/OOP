package homeWork1;

import java.util.*;

class Bank {
	private String theName;
	private List<Account> theAccounts;
	
	public Bank(String aName) {
		theName = aName;
		theAccounts = new ArrayList<Account>();
	}
	
	// New Account
	public void openAccount(String aNumber, int anInitialBalance) {
		Account acc = new Account(aNumber, anInitialBalance);
		theAccounts.add(acc);
	}
	
	public void creditAccount(String aNumber, int anAmount) {
		for(Account nextNumber: theAccounts) { 					// 비교를 위한 nextNumber 선언
			if(nextNumber.getNumber().equals(aNumber)) { 		// theAccounts의 String 구하기
				nextNumber.credit(anAmount);
			}
		}
	}
	
	public void debitAccount(String aNumber, int anAmount) {
		for(Account nextNumber: theAccounts) {
			if(nextNumber.getNumber().equals(aNumber)) {
				nextNumber.debit(anAmount);
			}
		}
	}
	
	public int getAccountBalance(String aNumber) {
		int number = 0;
		for(Account nextNumber: theAccounts) {
			if(nextNumber.getNumber().equals(aNumber)){
				number = nextNumber.getBalance();
			}
		}
		return number;
	}
	
	public int getTotalAssets() {
		int totalAssets = 0;
		for(int i=0; i<theAccounts.size(); i++) {
			Account asdf = theAccounts.get(i);
			totalAssets += asdf.getBalance();
		}
		return totalAssets;
	}
}