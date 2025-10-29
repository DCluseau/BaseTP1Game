package BaseTP1Game;

import java.util.Scanner;

public class Game {
	// Variables initialization
	// Minimum number to find - 1
	int min;
	// Maximum number to find - 1
	int max;
	// Range in which the number must be chosen
	int range;
	// Generated random number
	int nbRandom;
	// Number the player enters
	int userChoice;
	// Scanner to read the player's input
	Scanner scan;
	// Number of tries before winning (score)
	int score;
	// Indicates if the player wants to continue the game or not
	boolean continueGame;
	// String to verify if the string entered when continue game is asked
	String userContinue;
	// Boolean to verify if the player input Y or N when asked
	boolean containsYN;
	
	// Contructor
	public Game() {
		this.min = 0;
		this.max = 99;
		this.range = max - min + 1;
		this.nbRandom = (int) (Math.random() * range) + min;
		this.userChoice = this.min;
		this.scan = new Scanner(System.in);
		this.score = 1;
		this.continueGame = true;
		this.userContinue = "Y";
		this.containsYN = false;
	}
	
	public void enterNumber() {
		// Computer asks the player to input a number
		System.out.println("Please enter a number between 1 and 100 : \n");
		// Computer checks if a number has been entered
		while(!scan.hasNextInt()) {
			// Computer displays error if not
			System.out.println("Error : you must enter a number between 1 and 100 : ");
			scan.next();
		}
		// Computer saves the number entered
		this.userChoice = this.scan.nextInt();
	}
	
	public boolean displayStep() {
		// Checks if the number is higher, lower or equal to the random number
		if(this.userChoice < this.nbRandom) {
			System.out.println("Please enter a higher number.");
			this.score ++;
			return false;
		}else if(this.userChoice > this.nbRandom) {
			System.out.println("Please enter a lower number.");
			this.score ++;
			return false;
		}else {
			System.out.println("You have succeeded in " + score + " times.");
			return true;
		}
	}
	
	public void userChoiceGame() {
		// Computer asks if the player wants to play the game or if they want to continue
		this.containsYN = false;
		if(this.score == 1) {
			System.out.println("Hello, would you like to play my game ? Y/N \n");
		}else {
			System.out.println("Would you like to replay the game ? Y/N \n");
		}
		while(!this.containsYN){
			// Computer checks if Y or N has been entered
			// Computer waits for a response from the player
			this.userContinue = this.scan.next();
			if(this.userContinue.equals("Y")) {
				this.continueGame = true;
				this.containsYN = true;
				// Random number is generated
				this.nbRandom = (int) (Math.random() * range) + min;
				// Score is reinitialized
				this.score = 1;
			}else if(this.userContinue.equals("N")) {
				this.continueGame = false;
				this.containsYN = true;
			}else {
				// If Y or N haven't been entered, the computer displays an error and asks again a response
				System.out.println("Please enter Y or N.\n");
				this.containsYN = false;
				this.scan.nextLine();
			}
		}
	}
}
