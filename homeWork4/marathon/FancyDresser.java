package marathon;

public class FancyDresser extends Amateur {
	String mCostume;
	
	public FancyDresser(int pNumber, SponsorshipForm pSponsorshipForm, String pCostume) {
		super(pNumber, pSponsorshipForm);
		this.mCostume = pCostume;
	}
	
	@Override
	public String toString() {
		return super.toString() + " (" + mCostume +") ";
	}
}
