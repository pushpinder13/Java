import java.util.*;

public class Permutation_in_String {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        Solution obj = new Solution();
        System.out.println(obj.checkInclusion(a, b));
        sc.close();

    }
}

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        String sortedS1 = sort(s1);
        int len = s1.length();

        for (int i = 0; i <= s2.length() - len; i++) {
            String substring = s2.substring(i, i + len);
            if (sortedS1.equals(sort(substring))) {
                return true;
            }
        }
        return false;
    }

    private String sort(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}