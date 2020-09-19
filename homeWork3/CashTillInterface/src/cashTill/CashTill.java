package cashTill;

import saleableItem.*;

public class CashTill {
	private double runningTotal;
	private int copies;
	public CashTill() {
		runningTotal = 0;
	}

	public void sellItem(SaleableItem pPub) {
		runningTotal = runningTotal + pPub.getPrice();
		System.out.print("Sold ");
		pPub.sellCopy();
		pPub.sellCopies();
	}
	
	public int getCopies(SaleableItem pPub) {
		return pPub.getCopies();
	}
	
	public void showTotal() {
		System.out.println("GRAND TOTAL: " + runningTotal);
	}
}
