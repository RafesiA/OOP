package exceptionTest;

public class TestProgram {
	public static void main(String[] args) {
		ClientBook manager = new ClientBook();
		Client c = new Client("Kyeong jin", "Ansan", "108511", 1, 1);
		Client d = new Client("Jae hyeong", "Ansan", "108523", 2, 2);
		Client e = new Client("Seo Gu", "Ansan", "109935", 3, 3);
		Client f = new Client("Ho Ki", "Ansan", "108519", 4, 4);
		Client g = new Client("Sang min", "Ansan", "1045782", 5, 5);
		Client h = new Client("Ki tae", "Ansan", "104528", 6, 6);
		
		
		manager.addClient(c.getName(), c);
		manager.addClient(d.getName(), d);
		manager.addClient(e.getName(), e);
		manager.addClient(f.getName(), f);
		manager.addClient(g.getName(), g);
		manager.addClient(h.getName(), h);
	
		try {
			manager.getClient("Kyeong jin").toString();
			System.out.println("Client is known as " + c + "\n");
			manager.getClient("Jae hyeong").toString();
			System.out.println("Client is know as " + d + "\n");
			manager.getClient("Seo Gu").toString();
			System.out.println("Client is know as " + e + "\n");
			manager.getClient("Ho Ki").toString();
			System.out.println("Client is know as " + f + "\n");
			manager.getClient("Sang min").toString();
			System.out.println("Client is know as " + g + "\n");
			manager.getClient("Ki tae").toString();
			System.out.println("Client is know as " + h + "\n");
		} catch (UnknownClientException uke) {
			System.out.println("No such client");
		
		}
		
		try {
			manager.awardLoan(c);
			manager.awardLoan(d);
			manager.awardLoan(e);
			manager.awardLoan(f);
			manager.awardLoan(g);
			manager.awardLoan(h);
			
		} catch (DeniedAccessException dae) {
			System.out.println(dae);
			System.out.println(h.getName() + " has rating out of range");
		}
		
		
		
		
	}
}
