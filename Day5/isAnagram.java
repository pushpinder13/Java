import java.util.*;


class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        Arrays.sort(sArray);
        Arrays.sort(tArray);
       
        for (int i = 0; i < s.length(); i++) {
            if (sArray[i] != tArray[i]) {
                return false;
            }
        }
        
        return true;
    }
}

public class isAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter string s: ");
        String s = scanner.nextLine();
        
        System.out.print("Enter string t: ");
        String t = scanner.nextLine();
        
        Solution solution = new Solution();
        boolean result = solution.isAnagram(s, t);
        
        if (result) {
            System.out.println("'" + s + "' and '" + t + "' are anagrams.");
        } else {
            System.out.println("'" + s + "' and '" + t + "' are not anagrams.");
        }
        
        scanner.close();
    }
}
