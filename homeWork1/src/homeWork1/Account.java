package homeWork1;

class Account {
	private String theNumber;
	private int theBalance;

	
	public Account(String aNumber, int anInitialBalance) {
		theNumber = aNumber;
		theBalance = anInitialBalance;
	}
	
	public Account() {
		this("", 0);
	}
	
	public void credit(int anAmount) {
		theBalance += anAmount;
	}
	public void debit(int anAmount) {
		if(theBalance >= anAmount) theBalance -= anAmount;
	}
	public int getBalance() {
		return theBalance;
	}
	public void display() {
		System.out.println("����");
		System.out.println("\t" + "��ȣ: " + theNumber);
		System.out.println("\t" + "�ܾ�: " + theBalance);
	}
	
	public String getNumber() {
		return theNumber;
	}
}
