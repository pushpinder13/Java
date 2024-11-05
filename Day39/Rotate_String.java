import java.util.Scanner;

class Solution {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;

        char[] arr = goal.toCharArray();

        for (int i = 0; i < s.length(); i++) {

            char last = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;

            String a = new String(arr);
            if (a.equals(s)) {
                return true;
            }
        }
        return false;
    }
}

public class Rotate_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String d = sc.nextLine();
        System.out.println(Solution.rotateString(s, d));
        sc.close();
    }
}