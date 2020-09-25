package marathon;

public abstract class Runner {
	public int number;
	boolean finished;
	int hours = 0;
	int mins = 0;
	int secs = 0;
	
	public Runner(int pNumber) {
		this.number = pNumber;
		this.finished = false;
	}
	
	void result() {
		if(finished)
			System.out.println(this + " 마라톤 완주 기록: " + hours + "시 " + mins+  "분 "
								 + secs + "초\n" );
		else
			System.out.println(this + "아직 미완주");
	}
	
	public void finish(int hours, int mins, int secs) {
		this.hours = hours;
		this.mins = mins;
		this.secs = secs;
		if(hours >= 4 && mins >= 30 && secs >= 00) {
			this.finished = false;
		} else 
			this.finished = true;
		this.result();
	}
	public String toString() {
		return "Runner " + number;
	}
}
