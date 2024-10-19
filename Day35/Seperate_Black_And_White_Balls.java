import java.util.Scanner;

public class Seperate_Black_And_White_Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string of balls (0 for white, 1 for black): ");
        String s = scanner.nextLine();

        Solution solution = new Solution();
        long result = solution.minimumSteps(s);

        System.out.println("Minimum steps to separate black and white balls: " + result);

        scanner.close();
    }
}

class Solution {
    public long minimumSteps(String s) {
        long swap = 0;
        int black = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                swap += black;
            else
                black++;
        }
        return swap;
    }
}
