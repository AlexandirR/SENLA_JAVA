package Num4;

import java.util.*;

public class MainNumb {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int numb = scanner.nextInt();
            if(numb < 0)
                throw new InputMismatchException();
            List<Integer> numbs = new ArrayList<>();
            while (numb > 0) {
                numbs.add(numb%10);
                numb/=10;
            }
            Collections.reverse(numbs);
            Numb starNumb = new Numb(numbs);
            starNumb.printNumb();
        }
        catch (InputMismatchException e) {
            System.out.println("Неправильный ввод");
        }
    }
}
