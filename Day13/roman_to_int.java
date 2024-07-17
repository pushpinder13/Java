import java.util.Scanner;

class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            switch (c) {
                case 'I':
                    result += (result >= 5 ? -1 : 1);
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    result += 10 * (result >= 50 ? -1 : 1);
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    result += 100 * (result >= 500 ? -1 : 1);
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
            }
        }
        return result;
    }
}

public class roman_to_int {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();

        Solution solution = new Solution();
        int result = solution.romanToInt(romanNumeral);

        System.out.println("The integer value of the Roman numeral is: " + result);

        scanner.close();
    }
}