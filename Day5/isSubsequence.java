import java.util.Scanner;

class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        if (t.length() == 0) return false;
        
        int start = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(start) == t.charAt(i)) {
                start++;
                if (start >= s.length()) return true;
            }
        }
        return false;
    }
}

public class isSubsequence{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        
        Solution solution = new Solution();
        boolean result = solution.isSubsequence(s, t);
        
        if (result) {
            System.out.println("'" + s + "' is a subsequence of '" + t + "'.");
        } else {
            System.out.println("'" + s + "' is not a subsequence of '" + t + "'.");
        }
        
        scanner.close();
    }
}
