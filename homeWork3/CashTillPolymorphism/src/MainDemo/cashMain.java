package MainDemo;

import publication.*;
import cashTill.CashTill;
import java.util.*;

public class cashMain {
	
	ArrayList<Publication> pList = new ArrayList<Publication>();
	Scanner scan = new Scanner(System.in);
	CashTill cashTill;
	
	cashMain(){
		Publication book1 = new Book("Java Programming", 20000, 10);
		Publication magazine1 = new Magazine("Software World", 5000, 10);
		Publication discMag = new DiscMag("Good Software", 10000, 10);
		Publication magazine2 = new Magazine("Computer World", 5000, 10);
		Publication book2 = new Book("Discrete Mathematics", 30000, 10);
		pList.add(book1);
		pList.add(magazine1);
		pList.add(discMag);
		pList.add(magazine2);
		pList.add(book2);
		cashTill = new CashTill();
	}
	
	public static void main(String[] args) {
		CashTill cashTill = new CashTill();
		cashMain CM = new cashMain();
		int resultCopies = 0;

		System.out.println("나는 지목 안당하겠지 하며 천천히 하다 결국 걸려버린 조경진의 서점");
		
		
		//for(int i =0; i<CM.pList.size(); i++) {
		//	
		//	cashTill.sellItem(CM.pList.get(i));
		//}

		for(Publication sList : CM.pList) {
			if(sList.getTitle().equals("Good Software")) {
				System.out.println("We Found 'Good Software'");
				cashTill.sellItem(CM.pList.get(2));
			}
			if(sList.getTitle().equals("Java Programming")) {
				System.out.println("We Found 'Java  Programming'");
				cashTill.sellItem(CM.pList.get(0));
			}
			if(sList.getTitle().equals("Java Programming")) {
				System.out.println("We Found 'Java  Programming'");
				cashTill.sellItem(CM.pList.get(0));
			}
			if(sList.getTitle().equals("Java Programming")) {
				System.out.println("We Found 'Java  Programming'");
				cashTill.sellItem(CM.pList.get(0));
			}
			if(sList.getTitle().equals("Discrete Mathematics")) {
				System.out.println("We Found 'Discrete Mathematics'");
				cashTill.sellItem(CM.pList.get(4));
			}
			if(sList.getTitle().equals("Discrete Mathematics")) {
				System.out.println("We Found 'Discrete Mathematics'");
				cashTill.sellItem(CM.pList.get(4));
			}
			if(sList.getTitle().equals("Java Programming")) {
				System.out.println("We Found 'Java  Programming'");
				cashTill.sellItem(CM.pList.get(0));
			}
			if(sList.getTitle().equals("Discrete Mathematics")) {
				System.out.println("We Found 'Discrete Mathematics'");
				cashTill.sellItem(CM.pList.get(4));
			}
			if(sList.getTitle().equals("Good Software")) {
				System.out.println("We Found 'Good Software'");
				cashTill.sellItem(CM.pList.get(2));
			}
			if(sList.getTitle().equals("Software World")) {
				System.out.println("We Found 'Software World'");
				cashTill.sellItem(CM.pList.get(1));
			}
			
			
		}
		cashTill.showTotal();
		for(int i =0; i<CM.pList.size(); i++) {
			resultCopies += cashTill.getCopies(CM.pList.get(i));
		}
		System.out.println("Copies " + resultCopies + " left");
	}
	
}