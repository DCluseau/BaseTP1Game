package BaseTP1Game;

public class BaseTP1Game {

	public static void main(String[] args) {
		Game newGame = new Game();
		newGame.userChoiceGame();
		while(newGame.continueGame) {
			newGame.enterNumber();
			while(newGame.displayStep() == false) {
				newGame.enterNumber();
			}
			newGame.userChoiceGame();
		}
		System.out.println("Goodbye !");
	}

}
