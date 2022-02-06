package Num3;

import java.util.*;
import java.util.stream.Collectors;

public class VowelsMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        List<Word> words = Arrays.asList(line.split(" "))
                .stream()
                .map(l -> new Word(l))
                .collect(Collectors.toList());
        words.sort(new VowelsReverseComp());
        for(Word word : words) {
            System.out.println(word);
        }
    }
}
