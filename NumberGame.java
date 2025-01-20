import java.util.Random;
import java.util.Scanner;

public class NumberGame{

public static void main(String[] args){

Random rand = new Random();

//Number to guess is between 1 and 100
int numberToGuess = rand.nextInt(100) + 1;

//Tracker for tries
int numberOfTries = 0;
final int MAX_TRIES = 10;

//Scanner that reads User input
Scanner input = new Scanner(System.in);
int guess;
boolean win = false;

while (numberOfTries < MAX_TRIES && !win) {

//Display of Number Game Prompt
System.out.println("Guess my number between 1 and 100:");

//User input Prompt
guess = input.nextInt();
numberOfTries++;

// Feedback for correct answer
if (guess == numberToGuess) {
win = true;
}

// Feedback for being too Low
else if (guess < numberToGuess) {
System.out.println("Too Low");
}

// Feedback for being too High
else if (guess > numberToGuess) {
System.out.println("Too High");
}
}

if (win) {
System.out.println("Winner Winner Chicken Dinner!!!");
System.out.println("My Number was " + numberToGuess);
System.out.println("You guessed it in " + numberOfTries + " tries.");

} else {

System.out.println("You Lost!!!");
System.out.println("My Number was " + numberToGuess);
}
}
}
