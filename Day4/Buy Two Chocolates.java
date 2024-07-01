import java.util.Arrays;
import java.util.Scanner;

public class Buy_Two_Chocolates {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int minCost = prices[0] + prices[1];
        if (minCost > money) {
            return money;
        }
        return money - minCost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of prices: ");
        int n = scanner.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter the prices: ");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        System.out.print("Enter the amount of money: ");
        int money = scanner.nextInt();
        Buy_Two_Chocolates solution = new Buy_Two_Chocolates();
        int remainingMoney = solution.buyChoco(prices, money);
        System.out.println("Remaining money: " + remainingMoney);
        scanner.close();
    }
}
