# THE GAME
(a Java exercise)

## Table of contents

[Goal](#goal)

[User's manual](#user-s-manual)

[Classes and methods](#classes-and-methods)

## Goal

The goal is to guess a random generated number. Tha player can replay the game if they want to.

## User's manual

- Use Java 8
- The computer asks the player if they want to play the game
  - If the player says yes by entering the letter Y, the game begins
  - Else if they type the letter N the program ends and the computer says goodbye (because it is polite)
  - Else the computer asks again a letter
- The computer asks the player to enter a number between 1 and 100
  - If the player enters something which isn't a number, the computer displays an error and asks a number again
  - If the player enters a number, the computer says if it's lower or higher than the random number. If they are equal, the computer displays how many tries it took the layer to guess the number
- The computer asks if the player wants to replay the game
  - If they enter the letter Y, the game starts again
  - Else if they enter the letter N, the game and the program end
  - Else the computer displays an error and asks a letter again.

## Classes and methods
  - Main class (BaseTP1Game) :
    - At the beginning of the program, a Game object is initialized
    - The computer asks the player if they want to play using the userChoiceGame function from the Game class
    - While the player doesn't indicate that they want to quit the game, the computer asks a number with the enterNumber function and user the displaySteps of the Game class to indicates to the player if they have to enter a new number or if they have guessed right
    - Once the player has indicated that they want to quit the game, the program ends
  - Game class :
    - Attributes :
      - min : Minimum number to find - 1
      - max : Maximum number to find - 1
      - range : Range in which the number must be chosen
      - nbRandom : random generated number
      - userChoixce : number chosen by the player
      - scan : Scanner used to get the player's input
      - score : Number of tries
      - continueGame : Boolean to indicates if the player wants to replay the game
      - userContinue : String used to get the input of the player to control what has been typed
      - containsYN : Boolean indicating that a correct input has been typed by the player
    - Methods :
      - Game (constructor) : initializes variables
      - enterNumber : asks a number to the player and displays an error if anything other than a number has been typed
      - displayStep : indicates to the player if they guessed right or not and updates the score
      - userChoiceGame : asks the player if they want to (re)play the game
