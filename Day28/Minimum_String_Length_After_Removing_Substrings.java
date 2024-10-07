import java.util.Scanner;

public class Minimum_String_Length_After_Removing_Substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Solution.minLength(s));

        sc.close();
    }
}

class Solution {
    public static int minLength(String s) {
        while (s.contains("AB") || s.contains("CD")) {
            s = s.replace("AB", "");
            s = s.replace("CD", "");
        }
        return s.length();

    }
}