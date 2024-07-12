import java.util.*;
class Solution {
    public String removeOuterParentheses(String s) {
        if (s == "")
            return s;
        int x = 0;
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                if (x > 0)
                    sb.append("(");
                x++;
            } else if (s.charAt(i) == ')') {
                x--;
                if (x > 0)
                    sb.append(")");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.print("Enter a string with parentheses: ");
        String input = scanner.nextLine();

        String result = solution.removeOuterParentheses(input);
        System.out.println("Result after removing outer parentheses: " + result);

        scanner.close();
    }
}
