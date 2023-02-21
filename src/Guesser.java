import java.util.Scanner;

public class Guesser extends Player{
    Scanner input;


    public Guesser(boolean isHuman){
        super(isHuman);
        input = new Scanner(System.in);
    }

    public char guessALetter(){
        if(isHuman){
            System.out.println("Input a letter to guess:");
            char letter = input.next().charAt(0);
            currentGuessedLetter = letter;
            return letter;
        }else{
            return word.generateNewChar(); // figure out how to generate new character, Maybe part of word class?
        }

    }


}
