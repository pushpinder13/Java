import java.util.Scanner;

public class Divide_Two_Integers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Solution.divide(a, b));
        sc.close();
    }
}

class Solution {
    public static int divide(int dividend, int divisor) {
        double d1 = dividend;
        double d2 = divisor;
        return (int) (d1 / d2);
    }
}