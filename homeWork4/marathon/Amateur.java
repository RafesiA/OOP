package marathon;

public class Amateur extends Runner {
	SponsorshipForm mSponsorshipForm;
	
	public Amateur(int pNumber, SponsorshipForm pSponsorshipForm) {
		super(pNumber);
		this.mSponsorshipForm = pSponsorshipForm;
	}
	
	public void finish(int hours, int mins, int secs) {
		super.finish(hours, mins, secs);
		mSponsorshipForm.printCollectionList();
	}
	
}
