package marathon;

public class Professional extends Runner {
	int mWorldRanking;
	
	public Professional(int pNumber, int pWorldRanking) {
		super(pNumber);
		this.mWorldRanking = pWorldRanking;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - PRO (World Ranking at " + mWorldRanking + ")";
	}
}
