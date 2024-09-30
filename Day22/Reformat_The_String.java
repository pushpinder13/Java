import java.util.Scanner;

class Solution {
    public static String reformat(String s) {
        StringBuilder l = new StringBuilder();
        StringBuilder d = new StringBuilder();
        StringBuilder e = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                l.append(c);
            } else {
                d.append(c);
            }
        }
        if (Math.abs(l.length() - d.length()) > 1) {
            return "";
        }
        int a = Math.min(l.length(), d.length());
        int c = Math.max(l.length(), d.length());
        int i = 0;
        for (i = 0; i < a; i++) {
            if (l.length() > d.length()) {
                e.append(l.charAt(i)).append(d.charAt(i));
            } else {
                e.append(d.charAt(i)).append(l.charAt(i));
            }
        }
        for (int k = i; k < c; k++) {
            if (l.length() > d.length()) {
                e.append(l.charAt(k));
            } else {
                e.append(d.charAt(k));
            }
        }

        return e.toString();

    }
}

public class Reformat_The_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of in string format: ");
        String a = sc.nextLine();
        String ans = Solution.reformat(a);

        System.out.println(ans);

        sc.close();
    }
}