
import java.util.*;

class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int ans = 0;
            while (num != 0) {
                int digit = num % 10;
                ans = ans + digit;
                num = num / 10;
            }
            num = ans;
        }
        return num;
    }
}

public class Add_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.addDigits(num));
        sc.close();

    }
}