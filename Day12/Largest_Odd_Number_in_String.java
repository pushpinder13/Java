import java.util.Scanner;

class Solution {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if (c % 2 != 0) {
                return num.substring(0, i + 1);
            } 
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        String largestOdd = solution.largestOddNumber(input);
        System.out.println("Largest odd number: " + largestOdd);
        
        scanner.close();
    }
}
