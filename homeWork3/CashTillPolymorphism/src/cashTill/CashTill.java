package cashTill;

import publication.Publication;

public class CashTill {

	private double runningTotal;
	private int copies;
	public CashTill() {
		runningTotal = 0;
	}

	public void sellItem(Publication pPub) {
		runningTotal = runningTotal + pPub.getPrice();
		System.out.print("Sold ");
		pPub.sellCopy();
		pPub.sellCopies();
	}
	
	public int getCopies(Publication pPub) {
		return pPub.getCopies();
	}
	
	
	public void showTotal() {
		System.out.println("GRAND TOTAL: " + runningTotal);
	}
}
