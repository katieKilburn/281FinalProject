public class main {



    public static void main(String[] args){
        new Game();
    }


}

class Game{
    public Hangman hangman;
    public Player human;
    public Player computer;
    public Guesser guesser;
    public Picker picker;

    public Game(){
        hangman = new Hangman(5);
        human = new Guesser(true);
        computer = new Picker(false);
        startGame();

    }
    public void startGame(){
        setGuesser(human);
        setPicker(computer);
        guesser.guessALetter();
        System.out.println("You guessed: " + Player.currentGuessedLetter);

    }

    public void setGuesser(Player player1){
        guesser = (Guesser) player1;
    }

    public void setPicker(Player player2){
        picker = (Picker) player2;
    }

}



