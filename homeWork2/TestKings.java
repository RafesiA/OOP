import java.util.*;

public class TestKings {
	public static void main(String[] args) {
		List<King> kings = (new Kings()).getKings();
		String choice;
		Scanner sc = new Scanner(System.in);
		int inputFrom;
		int inputTo;
		int i = 0;
		
		for(King theKing: kings) {
			System.out.println(theKing.getName() + " "
					+ theKing.getFrom() + " "
					+ theKing.getTo() );
		}

		while(true) {
			System.out.println("왕 검색하기");
			System.out.println("시작 년도");
			inputFrom = sc.nextInt();
			System.out.println("종료 년도");
			inputTo = sc.nextInt();
			
			System.out.println("You Inputed From : " + inputFrom + " To " + inputTo);
			
				for(King searchKings : kings ) { 			// for each
					if(inputFrom == searchKings.getFrom()) { 		// If user's input equals From
						System.out.println(searchKings.getName() + "  " + searchKings.getFrom() + " " +
																	searchKings.getTo());
						if(inputFrom == searchKings.getFrom() && inputTo == searchKings.getTo()) { // If Included only one king
							break;
						}
							i = 1; 			// enable search
							continue;
					}
					
					if(i==1 && inputFrom < inputTo) { // If user inputed correctly
						System.out.println(searchKings.getName() + "  " + searchKings.getFrom() + " " +
																		searchKings.getTo());
						if(inputTo == searchKings.getTo()) {break;} // If user's input equals To
					}
				} // for 문 마지막
				i = 0;						 // disable search
			} // while	

	}
}
