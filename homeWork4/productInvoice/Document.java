package productInvoice;

import java.util.*;

public abstract class Document {
	Address billingAddress;
	ArrayList<LineItem> items;
	
	Document(Address billingAddress){
		this.billingAddress = billingAddress;
	}
	
	public abstract String format();
	protected abstract double getAmountDue();
	public abstract void add(Product aProduct, int quantity);
}
