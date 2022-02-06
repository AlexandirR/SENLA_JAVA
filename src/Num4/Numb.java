package Num4;

import java.util.*;

public class Numb {

    private static Map<Integer, String[]> numb;

    private List<Integer> numbs;

    public Numb(List<Integer> numbs) {
        initNumb();
        this.numbs = numbs;
        Optional<Integer> max = this.numbs.stream().max(Comparator.naturalOrder());
        for(int i = 0; i < numb.get(0).length; ++i) {
            numb.get(max.get())[i] = numb.get(max.get())[i].replace("*", Integer.toString(max.get()));
        }
    }

    public void printNumb() {
        for(int i = 0; i < numb.get(0).length; ++i) {
            StringBuilder line = new StringBuilder();
            for(Integer digit : numbs) {
                line.append(numb.get(digit)[i] + " ");
            }
            System.out.println(line.toString());
        }
    }

    private void initNumb() {
        numb = new HashMap<>();
        numb.put(0,
                new String[]{
                        "  ***  ",
                        " *   * ",
                        "*     *",
                        "*     *",
                        "*     *",
                        " *   * ",
                        "  ***  "});
        numb.put(1,
                new String[]{
                        " *  ",
                        "**  ",
                        " *  ",
                        " *  ",
                        " *  ",
                        " *  ",
                        "***"});
        numb.put(2,
                new String[]{
                        " *** ",
                        "*   *",
                        "*  * ",
                        "  *  ",
                        " *   ",
                        "*    ",
                        "*****"});
        numb.put(3,
                new String[]{
                        "*****",
                        "    *",
                        "    *",
                        "*****",
                        "    *",
                        "    *",
                        "*****"});
        numb.put(4,
                new String[]{
                        "*   *",
                        "*   *",
                        "*   *",
                        "*****",
                        "    *",
                        "    *",
                        "    *"});
        numb.put(5,
                new String[]{
                        "*****",
                        "*    ",
                        "*    ",
                        "*****",
                        "    *",
                        "    *",
                        "*****"});
        numb.put(6,
                new String[]{
                        "*****",
                        "*    ",
                        "*    ",
                        "*****",
                        "*   *",
                        "*   *",
                        "*****"});
        numb.put(7,
                new String[]{
                        "*****",
                        "   * ",
                        "  *  ",
                        " *   ",
                        "*    ",
                        "*    ",
                        "*    "});
        numb.put(8,
                new String[]{
                        "*****",
                        "*   *",
                        "*   *",
                        "*****",
                        "*   *",
                        "*   *",
                        "*****"});
        numb.put(9,
                new String[]{
                        "*****",
                        "*   *",
                        "*   *",
                        "*****",
                        "    *",
                        "    *",
                        "*****"});
    }
}
