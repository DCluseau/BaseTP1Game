package BaseTP1Game;

public class BaseTP1Game {

	public static void main(String[] args) {
		// Initialization of the game
		Game newGame = new Game();
		// Computer asks user if they want to play the game
		newGame.userChoiceGame();
		// If they accept, the game begins, else the application closes
		while(newGame.continueGame) {
			// Computer asks a number
			newGame.enterNumber();
			while(newGame.displayStep() == false) {
				// While the player doesn't win, the game continues and displays if the number is higher or lower
				newGame.enterNumber();
				// If the player guesses right, the computer displays how many tries it took to win
			}
			// The computer asks the player if they want to continue the game
			newGame.userChoiceGame();
		}
		// Closing the scanner
		newGame.scan.close();
		System.out.println("Goodbye !");
		// End of program
	}

}
