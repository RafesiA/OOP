package saleableItem;

public class Ticket implements SaleableItem {

	String title;
	double price;
	int copies;
	
	public Ticket(String title, double price, int copies){
		this.title = title;
		this.price = price;
		this.copies = copies;
	}
	@Override
	public void sellCopy() {
		System.out.println("Title : " + title + " price : " + getPrice());
	}
	@Override
	public double getPrice() {
		return price;
	}
	@Override
	public String getTitle() {
		return title;
	}
	@Override
	public int getCopies() {
		System.out.println("Current " + title + " copies: " + copies);
		return copies;
	}
	@Override
	public int sellCopies() {
		return copies -= 1;
	}
	

}

