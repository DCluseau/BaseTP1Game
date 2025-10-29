package BaseTP1Game;

import java.util.Scanner;

public class Game {
	int min = 0;
	int max = 99;
	int range = max - min + 1;
	int nbRandom = (int) (Math.random() * range) + min;
	String testChoice = new String();
	int userChoice = -1;
	Scanner scan = new Scanner(System.in);
	int score = 1;
	boolean continueGame = true;
	String userContinue = "Y";
	boolean containsYN = false;
	
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
		System.out.println("Please enter a number between 1 and 100 : \n");
		while(!scan.hasNextInt()) {
			System.out.println("Error : you must enter a number between 1 and 100 : ");
			scan.next();
		}
		this.userChoice = this.scan.nextInt();
	}
	
	public boolean displayStep() {
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
		this.containsYN = false;
		if(this.score == 1) {
			System.out.println("Hello, would you like to play my game ? Y/N \n");
		}else {
			System.out.println("Would you like to replay the game ? Y/N \n");
		}
		while(!this.containsYN){
			this.userContinue = this.scan.next();
			if(this.userContinue.equals("Y")) {
				this.continueGame = true;
				this.containsYN = true;
				this.nbRandom = (int) (Math.random() * range) + min;
			}else if(this.userContinue.equals("N")) {
				this.continueGame = false;
				this.containsYN = true;
			}else {
				System.out.println("Please enter Y or N.\n");
				this.containsYN = false;
				this.scan.nextLine();
			}
		}
	}
}
