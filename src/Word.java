public class Word {
    String word;
    public Word(){
        word = "tired";
    }
    public Word(String word1){
        word = word1;
    }

    public Word generateNewWord(){
        Word newWord = new Word("school");
        return newWord;
    }
}
