package homeWork1;

import homeWork1.Bank;

class AccountBankTest1_2{
	public static void main(String[] args) {
		Bank bk = new Bank("�����б� ����");
		
		bk.openAccount("ABC123", 1200);
		bk.openAccount("DEF456", 1000);
		bk.openAccount("GHI789", 2000);
		
		bk.creditAccount("ABC123", 200);
		bk.debitAccount("ABC123", 900);
		bk.debitAccount("ABC123", 700);

		int balance = bk.getAccountBalance("ABC123");
		System.out.println("ABC123 ���� �ܾ�: " + balance);
		System.out.println("DEF456 ���� �ܾ�: " + bk.getAccountBalance("DEF456"));
		System.out.println("GHI789 ���� �ܾ�: " + bk.getAccountBalance("GHI789"));
		
		int totalAssets = bk.getTotalAssets();
		System.out.println("�� �ܾ�: " + totalAssets);
	}
}
