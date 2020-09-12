package dicegame;

import java.util.*;

public class DiceGame {
	private Die die1;
	private Die die2;
	private Player gamer;
	
	int rollAttempt = 0;
	int saveRollAttempt = 0;
	int averageRoll;
	
	ArrayList<Integer> diceRoll = new ArrayList<Integer>();
	
	
	
	public DiceGame() {
		die1 = new Die();
		die2 = new Die();
		gamer = new Player("Jo kyuong jin");
	}
	
	public void initialize() {
		boolean win;
		
		while(true) {
			rollAttempt++;
			
			win = gamer.play(die1, die2);
			if(win) {
				System.out.println("합이 7 이어서 승리");
				
				diceRoll.add(saveRollAttempt, rollAttempt);
				System.out.println("Roll Attempt : " + rollAttempt);
				System.out.println("Attempt game: " + (saveRollAttempt+1));
				
				averageRoll = rollAttempt / (saveRollAttempt+1);
				
				System.out.println("Average Roll: " + averageRoll);
				saveRollAttempt++;
				break;
			}
			
			else {
				System.out.println("합이 7이 아니어서 패배");
			}
		}
	}
	
	
	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		
		DiceGame dicegame = new DiceGame();
		System.out.println("201710957 조경진");
		dicegame.initialize();
		while(true) {
			System.out.println("Input 1 for restart game");
			choice = sc.nextInt();
			if(choice == 1) {
				dicegame.initialize();
			} else break;
		}
	}
}
