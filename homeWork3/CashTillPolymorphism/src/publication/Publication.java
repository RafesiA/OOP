package publication;

public abstract class Publication {

	String title;
	double price;
	int copies;
	
	Publication(String title, double price, int copies){
		this.title = title;
		this.price = price;
		this.copies = copies;
	}
	
	public String getTitle() {
		return title;
	}

	
	public abstract double getPrice();
	public abstract void sellCopy();
	public abstract int sellCopies();
	public abstract int getCopies();
	
}

