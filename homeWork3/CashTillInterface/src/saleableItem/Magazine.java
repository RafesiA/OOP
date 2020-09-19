package saleableItem;

public class Magazine extends Publication {

	public Magazine(String title, double price, int copies) {
		super(title, price, copies);
	}
	
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void sellCopy() {
		System.out.println("magazine : " + title + " price : " + getPrice());
	}
	
	@Override
	public int sellCopies() {
		return copies -= 1;
	}
	@Override
	public int getCopies() {
		System.out.println("Current " + title + " Copies: " + copies);
		return copies;
	}
	

}

