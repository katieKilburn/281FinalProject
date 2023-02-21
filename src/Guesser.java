public class Guesser extends Player{


    public Guesser(boolean isHuman){
        super(isHuman);
    }

    public char guessALetter(char letter){
        if(isHuman){
            guessedLetter = letter;
            return letter;
        }else{
            return word.generateNewChar(); // figure out how to generate new character, Maybe part of word class?
        }

    }


}
