package Num5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Backpack {

    private static Item[] items;
    private static int[][] dp;
    private static List<Integer> ans = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        items = new Item[n + 1];
        dp = new int[n + 1][k + 1];
        for(int i = 0; i < n; ++i) {
            int c = scanner.nextInt();
            int w = scanner.nextInt();
            items[i + 1] = new Item(c,w);
        }
        dinamic(n,k);
        recoveryAns(n,k);
        for(Integer item: ans) {
            System.out.println(item);
        }
    }

    public static void dinamic(int n, int k) {
        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= k; ++j) {
                if(j > items[i].getWeight()) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - items[i].getWeight()] + items[i].getCost());
                }
                else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
    }

    public static void recoveryAns(int i, int j) {
        if(dp[i][j] == 0)
            return;
        if(dp[i - 1][j] == dp[i][j])
            recoveryAns(i - 1, j);
        else {
            recoveryAns(i - 1, j - items[i].getWeight());
            ans.add(i);
        }
    }
}
