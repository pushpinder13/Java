import java.util.Scanner;

public class Water_Bottles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Solution.numWaterBottles(a, b));
        sc.close();

    }

}

class Solution {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        int temp = numBottles;
        while (temp >= numExchange) {

            int emptyb = temp / numExchange;
            sum = sum + emptyb;
            temp = emptyb + (temp % numExchange);
        }
        return sum;
    }
}