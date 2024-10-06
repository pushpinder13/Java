import java.util.Scanner;

public class Check_if_Numbers_Are_Ascending_in_a_Sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        Solution obj = new Solution();
        System.out.println(obj.areNumbersAscending(a));
        sc.close();
    }

}

class Solution {
    public boolean areNumbersAscending(String s) {
        String a[] = s.split(" ");
        int pre = 0;
        for (int i = 0; i < a.length; i++) {
            boolean found = false;
            String temp = a[i];
            for (char c : temp.toCharArray()) {

                if (Character.isDigit(c)) {
                    found = true;
                }
            }
            if (found) {
                int cur = Integer.parseInt(a[i]);

                if (cur <= pre) {
                    return false;
                }
                pre = cur;
            }

        }
        return true;
    }

}