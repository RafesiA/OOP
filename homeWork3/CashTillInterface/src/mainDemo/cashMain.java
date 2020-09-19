package mainDemo;

import saleableItem.*;
import cashTill.CashTill;

import java.util.*;


public class cashMain {
	ArrayList<SaleableItem> sList = new ArrayList<SaleableItem>();
	CashTill cashTill;
	Scanner scan = new Scanner(System.in);
	
	cashMain(){
		
		SaleableItem book1 = new Book("Java Programming", 20000, 10);
		SaleableItem magazine1 = new Magazine("Software World", 5000, 10);
		SaleableItem discMag = new DiscMag("Good Software", 10000, 10);
		SaleableItem magazine2 = new Magazine("Computer World", 5000, 10);
		SaleableItem book2 = new Book("Discrete Mathematics", 30000, 10);
		SaleableItem ticket = new Ticket("BTS Performance", 70000, 10);
		sList.add(book1);
		sList.add(magazine1);
		sList.add(discMag);
		sList.add(magazine2);
		sList.add(book2);
		sList.add(ticket);
		
		cashTill = new CashTill();
	}
	
	public static void main(String[] args) {
		int resultCopies = 0;
		CashTill cashTill = new CashTill();
		cashMain CM = new cashMain();
		
		for(SaleableItem ssList : CM.sList) {
			if(ssList.getTitle().equals("BTS Performance")) {
				System.out.println("We Found 'BTS Performance Ticket'");
				cashTill.sellItem(CM.sList.get(5));
			}
			if(ssList.getTitle().equals("BTS Performance")) {
				System.out.println("We Found 'BTS Performance Ticket'");
				cashTill.sellItem(CM.sList.get(5));
			}
			if(ssList.getTitle().equals("BTS Performance")) {
				System.out.println("We Found 'BTS Performance Ticket'");
				cashTill.sellItem(CM.sList.get(5));
			}
			if(ssList.getTitle().equals("Java Programming")) {
				System.out.println("We Found 'BTS Performance Ticket'");
				cashTill.sellItem(CM.sList.get(0));
			}
			
			if(ssList.getTitle().equals("BTS Performance")) {
				System.out.println("We Found 'BTS Performance Ticket'");
				cashTill.sellItem(CM.sList.get(5));
			}
			if(ssList.getTitle().equals("BTS Performance")) {
				System.out.println("We Found 'BTS Performance Ticket'");
				cashTill.sellItem(CM.sList.get(5));
			}
			if(ssList.getTitle().equals("Java Programming")) {
				System.out.println("We Found 'BTS Performance Ticket'");
				cashTill.sellItem(CM.sList.get(0));
			}
			if(ssList.getTitle().equals("BTS Performance")) {
				System.out.println("We Found 'BTS Performance Ticket'");
				cashTill.sellItem(CM.sList.get(5));
			}
			if(ssList.getTitle().equals("BTS Performance")) {
				System.out.println("We Found 'BTS Performance Ticket'");
				cashTill.sellItem(CM.sList.get(5));
			}
			if(ssList.getTitle().equals("BTS Performance")) {
				System.out.println("We Found 'BTS Performance Ticket'");
				cashTill.sellItem(CM.sList.get(5));
			}
		}
		for(int i =0; i<CM.sList.size(); i++) {
			resultCopies += cashTill.getCopies(CM.sList.get(i));
		}
		System.out.println(resultCopies + " copies lefts");
		cashTill.showTotal();
	}
}
