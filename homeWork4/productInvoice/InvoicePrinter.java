package productInvoice;

import java.util.*;


public class InvoicePrinter {
	public static void main(String[] args) {
		ArrayList<String> saveDocs;
		saveDocs = new ArrayList<String>();
		
		Address samAddress = new Address("Sam's Small Appliances", 
										"100 Main Street", "Anytown", "CA", "98765");
		Address peterAddress = new Address("Peter Industry", "76 Street", "Downtown", "WS", "66365");
		
		Document samsInvoice0 = new Invoice(samAddress);
		Document samsReceipt0 = new Receipt(peterAddress);
		samsInvoice0.add(new Product("Toaster", 29.95), 3);
		samsInvoice0.add(new Product("Hair dryer", 24.95), 1);
		samsInvoice0.add(new Product("Car vaccum", 19.99), 2);
		
		samsReceipt0.add(new Product("Toaster", 29.95), 3);
		samsReceipt0.add(new Product("Hair dryer", 24.95), 1);
		samsReceipt0.add(new Product("Toaster", 19.99), 2);
		saveDocs.add(samsInvoice0.format());
		saveDocs.add(samsReceipt0.format());
		///////////////////////////////////////////////////////////
		
		Document samsInvoice1 = new Invoice(samAddress);
		Document samsReceipt1 = new Receipt(peterAddress);
		
		samsInvoice1.add(new Product("Crispy Chicken", 14.99), 1);
		samsInvoice1.add(new Product("Calculus Book", 39.99), 2);
		

		samsReceipt1.add(new Product("Crispy Chicken", 14.99), 1);
		samsReceipt1.add(new Product("Calculus Book", 39.99), 2);
		saveDocs.add(samsInvoice1.format());
		saveDocs.add(samsReceipt1.format());
		///////////////////////////////////////////////////////////
		
		Document samsInvoice2 = new Invoice(samAddress);
		
		samsInvoice2.add(new Product("Magic Spoon", 29.99), 3);
		samsInvoice2.add(new Product("iPad Air", 499.99), 1);
		saveDocs.add(samsInvoice2.format());
		///////////////////////////////////////////////////////////
		
		
		
		for(int i =0; i<saveDocs.size(); i++) {
			System.out.println(saveDocs.get(i));
		}
	}
}