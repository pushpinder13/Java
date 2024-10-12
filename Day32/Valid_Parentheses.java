import java.util.*;

public class Valid_Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Solution.isValid(s));

        sc.close();
    }
}

class Solution {
    public static boolean isValid(String s) {
        Stack<Character> ss = new Stack<>();
        for (char a : s.toCharArray()) {
            if (a == '(') {
                ss.push(')');
            } else if (a == '{') {
                ss.push('}');
            } else if (a == '[') {
                ss.push(']');
            } else if (ss.isEmpty() || ss.pop() != a) {
                return false;
            }
        }
        return ss.isEmpty();

    }
}