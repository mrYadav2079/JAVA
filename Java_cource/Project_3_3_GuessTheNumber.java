package Java_cource;

import java.util.Scanner;

public class Project_3_3_GuessTheNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int actualNumber =23;
        int guessNumber;
        int noOfGuess=1;
        System.out.println("Please guess the integer ");
        guessNumber=keyboard.nextInt();
            while(guessNumber !=actualNumber){
                if(guessNumber>actualNumber){
                    System.out.println("your guess is too high please guess again");
                    guessNumber=keyboard.nextInt();
                    noOfGuess++;
                }else if(guessNumber <actualNumber);{
                    System.out.println("your guess is too low please guess again");
                    guessNumber=keyboard.nextInt();
                    noOfGuess++;
                }
            }
            System.out.println("Congrats you  have guessed the number in "+noOfGuess+" guesses");

    }
}
