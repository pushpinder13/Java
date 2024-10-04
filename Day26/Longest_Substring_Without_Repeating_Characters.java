import java.util.HashSet;
import java.util.Scanner;

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int len = 0;
        int j = 0;
        HashSet<Character> h = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {

            while (h.contains(s.charAt(i))) {
                h.remove(s.charAt(j));
                j++;
            }

            h.add(s.charAt(i));
            len = Math.max(len, i - j + 1);

        }
        return len;

    }
}

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int ans = Solution.lengthOfLongestSubstring(a);
        System.out.println(ans);
        sc.close();
    }
}
