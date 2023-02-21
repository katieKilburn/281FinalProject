import java.util.Scanner;

public class Picker extends Player{
    Word word;
    Scanner input;

    public Picker(boolean isHuman){
        super(isHuman);
        input = new Scanner(System.in);
    }

   public void pickWord(){
       System.out.println("Type word (press t) or generate random new word (press x)");
       String choice = input.next();

       while(!choice.equalsIgnoreCase("t") || choice.equalsIgnoreCase("x")){
           System.out.println("Type word (press t) or generate random new word (press x)");
           choice = input.next();
       }

       if(choice.equalsIgnoreCase("t")){
           word = new Word(input.next());
       }else{
           word = word.generateNewWord();
       }

   }

   public void setNumBodyParts(int i){

   }
}

