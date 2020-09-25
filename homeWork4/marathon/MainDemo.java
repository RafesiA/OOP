package marathon;
import java.util.*;

public class MainDemo {
	public static void main(String[] args) {
		ArrayList<Runner> rList = new ArrayList<Runner>();
		SponsorshipForm sponsor1 = new SponsorshipForm();
		SponsorshipForm sponsor2 = new SponsorshipForm();
		SponsorshipForm sponsor3 = new SponsorshipForm();
		SponsorshipForm sponsor4 = new SponsorshipForm();
		
		Runner p1 = new Professional(174, 17);
		
		Runner a1 = new Amateur(77, sponsor1);
		sponsor1.addSponsor("Samsung", 2000);
		sponsor1.addSponsor("LG", 1500);
		sponsor1.addSponsor("SK", 1800);
		
		Runner a2 = new Amateur(58, sponsor4);
		sponsor4.addSponsor("Apple", 3000);
		sponsor4.addSponsor("Google", 3500);
		
		
		Runner f1 = new FancyDresser(316, sponsor2, "Yellow Duck");
		sponsor2.addSponsor("Yellow Duck", 5000);
		Runner f2 = new FancyDresser(221, sponsor3, "White Bear");
		sponsor3.addSponsor("Coca-Cola", 2020);
		
		rList.add(p1);
		rList.add(a1);
		rList.add(a2);
		rList.add(f1);
		rList.add(f2);
		
		System.out.println("Welcome to GetFit's Marathon Contest");
		System.out.println(p1.toString() + " 입장");
		System.out.println(a1.toString() + " 입장");
		System.out.println(f1.toString() + " 입장");
		System.out.println(f2.toString() + " 입장");
		System.out.println(a2.toString() + " 입장");
		System.out.println("\nThe Marathon has started\n\n");
		
		p1.finish(2, 30, 25);
		a1.finish(3, 20, 50);
		a2.finish(3, 47, 65);
		f1.finish(3, 55, 45);
		f2.finish(4, 30, 01);

		
	}
}
