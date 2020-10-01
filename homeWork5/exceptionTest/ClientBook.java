package exceptionTest;

import java.util.*;

public class ClientBook {
	private Map<String, Client> clientMap;
	
	public ClientBook() {
		clientMap = new HashMap<String, Client>();
	}
	
	public void addClient(String pClientID, Client pNewClient) {
		clientMap.put(pClientID, pNewClient);
	}
	
	public Client getClient(String pClientID) throws UnknownClientException{
		Client foundClient;
		
		foundClient = clientMap.get(pClientID);
		
		if(foundClient != null) {
			return foundClient;
		}
		else {
			throw new UnknownClientException("ClientBook.getClient() : unknown client ID: "
					+ pClientID);
		}
	}
	
	public void awardLoan(Client clientRate) throws DeniedAccessException {
		int deny = 2;
		int requestClient = clientRate.getRating();
		
		if(requestClient <= deny && requestClient <= 5) {
			System.out.println(clientRate.getName() + " Awarded Loan.");
		}
		
		else if(requestClient > deny && requestClient <= 5) {
			System.out.println(clientRate.getName() + " Cant award loan cause your rating too low: " +
								requestClient);
		}
		
		else {
			throw new DeniedAccessException("out of range.");
		}
		
	}

}
