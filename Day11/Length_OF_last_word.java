import java.util.*;

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
    }
}

public class Length_OF_last_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String sb = new String(sc.nextLine());

        Solution solution = new Solution();
        int ans = solution.lengthOfLastWord(sb);

        System.out.println(ans);

        sc.close();

    }

}