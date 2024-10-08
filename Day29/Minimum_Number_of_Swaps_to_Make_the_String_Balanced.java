import java.util.Scanner;

public class Minimum_Number_of_Swaps_to_Make_the_String_Balanced {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Solution.minSwaps(s));

        sc.close();
    }
}

class Solution {
    public static int minSwaps(String s) {
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == '[') {
                c1++;
            } else if (a == ']') {
                if (c1 > 0) {
                    c1--;
                } else {
                    c2++;
                }
            }
        }
        return (int) (c2 + 1) / 2;
    }
}
