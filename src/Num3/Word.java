package Num3;

public class Word {
    private static final String allVowels = "уеыаоэяию";

    private String word;
    private int vowels;

    public Word(String word) {
        this.word = word;
        this.vowels = 0;
        boolean flag = false;
        for(int i = 0; i < word.length(); ++i) {
            if(allVowels.indexOf(
                    Character.toLowerCase(
                            word.charAt(i))) != -1) {
                if(!flag) {
                    this.word = word.replaceFirst(Character.toString(word.charAt(i)),
                            Character.toString(Character.toUpperCase(word.charAt(i))));
                    flag = true;
                }
                this.vowels++;
            }
        }
    }

    public int getVowels() {
        return vowels;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return word;
    }
}
