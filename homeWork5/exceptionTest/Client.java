package exceptionTest;

public class Client {
	private String name;
	private String address;
	private String phone;
	private int credit;
	private int rating;
	
	public Client(String pName, String pAddress, String pPhone, int pCredit, int tRating) {
		name = pName;
		address = pAddress;
		phone = pPhone;
		credit = pCredit;
		rating = tRating;
	}
	
	public String getName() {
		return name;
	}
	
	public int getCredit() {
		return credit;
	}
	public int getRating() {
		return rating;
	}
	
	public String toString() {
		return ("Client name: " + name + "\nAddress: " + address + "\nPhone: " 
				+ phone + "\nCurrent credit: " + credit + "\n"
						+ "Client Rating: " + rating);
	}
}
