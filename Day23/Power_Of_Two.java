import java.util.Scanner;

public class Power_Of_Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.isPowerOfTwo(num));
        sc.close();
    }

}

class Solution {
    public boolean isPowerOfTwo(int n) {
        for (int i = 0; i <= 30; i++) {
            int power = (int) Math.pow(2, i);

            if (n == power) {
                return true;
            }
        }
        return false;
    }
}