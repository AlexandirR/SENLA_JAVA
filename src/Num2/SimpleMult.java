package Num2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleMult {

    public static void factor(int n, int k) {
        if(n >= k) {
            while(n%k == 0) {
                System.out.println(k + " ");
                n /= k;
            }
            factor(n,k + 1);
        }
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            factor(num, 2);
        }
        catch (InputMismatchException e) {
            System.out.println("Неправильный ввод");
        }
    }
}
