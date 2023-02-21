public class Player {
    static int maxNumOfGuesses;
    static Word word;
    static char guessedLetter;
    boolean isHuman;

    public Player(boolean isHuman){
        this.isHuman = isHuman;
        maxNumOfGuesses = 0;
    }

    public void setWord(String newWord){
        word = new Word(newWord);
    }


}
