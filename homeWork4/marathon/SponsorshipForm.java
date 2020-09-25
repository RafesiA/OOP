package marathon;

import java.util.*;

public class SponsorshipForm {
	int mSponsorCount;
	List<String> mSponsors;
	List<Integer> mAmounts;
	
	public SponsorshipForm() {
		mSponsorCount = 0;
		mSponsors = new ArrayList<String>();
		mAmounts = new ArrayList<Integer>();
	}
	
	public void addSponsor(String pName, int pAmount) {
		mSponsors.add(pName);
		mAmounts.add(pAmount);
	}
	
	void printCollectionList() {
		System.out.println("This Runner Sponsored by: ");
		String nextItem;
		Integer nextAmt;
		Iterator it1 = mSponsors.iterator();
		Iterator it2 = mAmounts.iterator();
		while(it1.hasNext() && it2.hasNext()) {
			nextItem = (String)it1.next();
			nextAmt = (Integer)it2.next();
			System.out.println(nextItem + " " + nextAmt);
		}
		System.out.println();
	}
}
