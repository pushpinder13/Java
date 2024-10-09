import java.util.Scanner;

public class Minimum_Add_to_Make_Parentheses_Valid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Solution.minAddToMakeValid(s));

        sc.close();
    }
}

class Solution {
    public static int minAddToMakeValid(String s) {
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == '(') {
                c1++;
            } else if (a == ')') {
                if (c1 > 0) {
                    c1--;
                } else {
                    c2++;
                }
            }
        }
        return c1 + c2;
    }
}