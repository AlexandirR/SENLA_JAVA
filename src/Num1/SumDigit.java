package Num1;

import java.util.Scanner;

public class SumDigit {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextLine().chars()
                .filter(c -> Character.isDigit(c))
                .map(c -> Character.digit(c, 10))
                .sum();
        System.out.println(sum);
    }
}
