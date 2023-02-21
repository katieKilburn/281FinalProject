public class main {



    public static void main(String[] args){
        new Game();
    }


}

class Game{
    static Hangman hangman;
    static Player human;
    static Player computer;
    static Guesser guesser;
    static Picker picker;

    public Game(){
        hangman = new Hangman(5);
        human = new Guesser(true);
        computer = new Picker(false);
        startGame();
    }
    public void startGame(){
        setGuesser(human);
        setPicker(computer);

        System.out.println(guesser.guessALetter('a'));

    }

    public void setGuesser(Player player1){
        guesser = (Guesser) player1;
    }

    public void setPicker(Player player2){
        picker = (Picker) player2;
    }

}



