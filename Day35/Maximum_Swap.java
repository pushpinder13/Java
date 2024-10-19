import java.util.Scanner;

public class Maximum_Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.maximumSwap(num);

        System.out.println("Maximum number after one swap: " + result);

        scanner.close();
    }
}

class Solution {
    public int maximumSwap(int num) {
        int maxi = num;
        String l = Integer.toString(num);
        int n = l.length();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char[] arr = l.toCharArray();
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                int tempn = Integer.parseInt(new String(arr));
                if (tempn > maxi) {
                    maxi = tempn;
                }
            }
        }
        return maxi;
    }
}