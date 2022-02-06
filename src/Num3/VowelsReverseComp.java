package Num3;

import java.util.Comparator;

public class VowelsReverseComp implements Comparator<Word> {

    @Override
    public int compare(Word o1, Word o2) {
        return -1 * Integer.compare(o1.getVowels(), o2.getVowels());
    }
}
