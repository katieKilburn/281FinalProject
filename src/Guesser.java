public class Guesser extends Player{


    public Guesser(boolean isHuman){
        super(isHuman);
    }

    public char guessALetter(char letter){
        guessedLetter = letter;
        return letter;
    }


}
