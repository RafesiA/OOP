package productInvoice;
import java.util.*;

public class Receipt extends Document{
	private Address billingAddress;
	private ArrayList<LineItem> items;
	
	public Receipt(Address anAddress) {
		super(anAddress);
		billingAddress = anAddress;
		items = new ArrayList<LineItem>();
	}
	
	public String format() {
		String r = "                            R E C E I P T \n\n" + billingAddress.format()
					+ String.format("\n\n%-30s%8s%5s%8s\n", "Decription", "Price", "Qty", "Total");
		for(LineItem item : items) {
			r = r + item.format() + "\n";
		}
		r = r + String.format("\nAmount Received: $%8.2f", getAmountDue());
		return r;
	}
	@Override
	public void add(Product aProduct, int quantity) {
		LineItem anItem = new LineItem(aProduct, quantity);
		items.add(anItem);
	}
	
	public double getAmountDue() {
		double percentage = 0.1;
		double amountDue = 0;
		double resultAmount = 0;
		
		for(LineItem item : items) {
			amountDue = amountDue + item.getTotalPrice();
			resultAmount = amountDue * percentage;
			resultAmount += amountDue;
		}
		return resultAmount;
	}

}
