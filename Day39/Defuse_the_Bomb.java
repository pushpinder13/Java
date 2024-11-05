import java.util.Scanner;

public class Defuse_the_Bomb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans[] = Solution.decrypt(arr, k);
        for (int i : ans) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}

class Solution {
    public static int[] decrypt(int[] code, int k) {

        if (k > 0) {
            int[] result = new int[code.length];
            for (int i = 0; i < code.length; i++) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {
                    sum = sum + code[(i + j) % code.length];
                }
                result[i] = sum;
            }
            return result;
        } else if (k < 0) {
            int[] result = new int[code.length];

            for (int i = 0; i < code.length; i++) {
                int sum = 0;
                int s = -k;
                for (int j = 1; j <= s; j++) {
                    sum += code[(i - j + code.length) % code.length];
                }
                result[i] = sum;
            }
            return result;
        }
        return new int[code.length];

    }
}